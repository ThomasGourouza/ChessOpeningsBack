package com.cavalierfou.chessopenings.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cavalierfou.chessopenings.constant.Constant;
import com.cavalierfou.chessopenings.customentity.MoveCustom;
import com.cavalierfou.chessopenings.customentity.OpeningCustom;
import com.cavalierfou.chessopenings.entity.Move;
import com.cavalierfou.chessopenings.entity.Opening;
import com.cavalierfou.chessopenings.entity.Relation;
import com.cavalierfou.chessopenings.repository.JdbcRepository;
import com.cavalierfou.chessopenings.repository.MoveJpaRepository;
import com.cavalierfou.chessopenings.repository.OpeningJpaRepository;
import com.cavalierfou.chessopenings.repository.RelationJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpeningService {

    @Autowired
    private OpeningJpaRepository openingJpaRepository;
    @Autowired
    private MoveJpaRepository moveJpaRepository;
    @Autowired
    private RelationJpaRepository relationJpaRepository;
    @Autowired
    private JdbcRepository jdbcRepository;

    public OpeningCustom findById(Long id) {
        Optional<Opening> existingOpeningOptional = openingJpaRepository.findById(id);
        if (existingOpeningOptional.isPresent()) {
            return mapToCustom(existingOpeningOptional.get());
        } else {
            return null;
        }
    }

    public List<OpeningCustom> find(String name) {
        List<Opening> openings = (name != null) ? openingJpaRepository.findByNameContainingIgnoreCase(name)
                : openingJpaRepository.findAll();

        List<OpeningCustom> openingCustoms = new ArrayList<>();
        if (openings.isEmpty()) {
            return openingCustoms;
        }
        openings.forEach(opening -> openingCustoms.add(mapToCustom(opening)));

        return openingCustoms;
    }

    private OpeningCustom mapToCustom(Opening opening) {
        long openingId = opening.getId();

        OpeningCustom openingCustom = new OpeningCustom();

        Relation parentRelation = relationJpaRepository.findByChildOpeningId(openingId);
        Long parentOpeningId = parentRelation != null ? parentRelation.getParentOpeningId() : null;

        List<Relation> childRelation = relationJpaRepository.findByParentOpeningId(openingId);
        List<Long> childOpeningIds = childRelation.stream().map(relation -> relation.getChildOpeningId())
                .collect(Collectors.toList());

        List<Move> moves = moveJpaRepository.findByOpeningId(openingId);
        List<MoveCustom> moveCustoms = moves.stream().map(move -> mapToMoveCustom(move)).collect(Collectors.toList());

        openingCustom.setId(openingId);
        openingCustom.setName(opening.getName());
        openingCustom.setParentOpeningId(parentOpeningId);
        openingCustom.setChildOpeningIds(childOpeningIds);
        openingCustom.setMoves(moveCustoms);

        return openingCustom;
    }

    private MoveCustom mapToMoveCustom(Move move) {
        var moveCustom = new MoveCustom();

        moveCustom.setMoveNumber(move.getMoveNumber());
        moveCustom.setColor(move.getColor());
        moveCustom.setPiece(move.getPiece());
        moveCustom.setColumnFrom(move.getColumnFrom());
        moveCustom.setLineFrom(move.getLineFrom());
        moveCustom.setColumnTo(move.getColumnTo());
        moveCustom.setLineTo(move.getLineTo());

        return moveCustom;
    }

    public boolean isPresent(Long id) {
        return openingJpaRepository.findById(id).isPresent();
    }

    public void save(OpeningCustom openingToSave) {

        var opening = new Opening();
        opening.setName(openingToSave.getName());

        jdbcRepository.resetSequence(Constant.O.getValue(), Constant.OIS.getValue());
        var savedOpening = openingJpaRepository.save(opening);

        if (openingToSave.getParentOpeningId() != null) {
            var relationToSave = new Relation();
            relationToSave.setParentOpeningId(openingToSave.getParentOpeningId());
            relationToSave.setChildOpeningId(savedOpening.getId());

            jdbcRepository.resetSequence(Constant.R.getValue(), Constant.RIS.getValue());
            relationJpaRepository.save(relationToSave);
        }

        if (!openingToSave.getMoves().isEmpty()) {
            List<Move> movesToSave = openingToSave.getMoves().stream().map(moveCustom -> {
                var move = new Move();
                move.setOpeningId(savedOpening.getId());
                move.setMoveNumber(moveCustom.getMoveNumber());
                move.setColor(moveCustom.getColor());
                move.setPiece(moveCustom.getPiece());
                move.setColumnFrom(moveCustom.getColumnFrom());
                move.setLineFrom(moveCustom.getLineFrom());
                move.setColumnTo(moveCustom.getColumnTo());
                move.setLineTo(moveCustom.getLineTo());
                return move;
            }).collect(Collectors.toList());

            jdbcRepository.resetSequence(Constant.M.getValue(), Constant.MIS.getValue());
            moveJpaRepository.saveAll(movesToSave);
        }

    }

    public void delete(Long id) {
        jdbcRepository.delete(Constant.R.getValue(), Constant.POID.getValue(), id.toString());
        jdbcRepository.delete(Constant.R.getValue(), Constant.COID.getValue(), id.toString());
        jdbcRepository.delete(Constant.M.getValue(), Constant.OID.getValue(), id.toString());

        openingJpaRepository.deleteById(id);
    }

}
