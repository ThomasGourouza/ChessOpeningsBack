package com.cavalierfou.chessopenings.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cavalierfou.chessopenings.customentity.MoveCustom;
import com.cavalierfou.chessopenings.customentity.OpeningCustom;
import com.cavalierfou.chessopenings.entity.Move;
import com.cavalierfou.chessopenings.entity.Opening;
import com.cavalierfou.chessopenings.entity.Relation;
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

    public OpeningCustom findById(Long id) {
        Optional<Opening> existingOpeningOptional = openingJpaRepository.findById(id);
        if (existingOpeningOptional.isPresent()) {
            return mapToCustom(existingOpeningOptional.get());
        } else {
            return null;
        }
    }

    public List<OpeningCustom> find(String truc) {
        List<Opening> openings = openingJpaRepository.findAll();
        List<OpeningCustom> playerCustoms = new ArrayList<>();
        if (openings.isEmpty()) {
            return playerCustoms;
        }
        openings.forEach(player -> playerCustoms.add(mapToCustom(player)));

        return playerCustoms;
    }

    private OpeningCustom mapToCustom(Opening opening) {
        long openingId = opening.getId();

        OpeningCustom openingCustom = new OpeningCustom();

        Relation parentRelation = relationJpaRepository.findByChildOpeningId(openingId);
        Long parentOpeningId = parentRelation != null ? parentRelation.getId() : null;

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
        MoveCustom moveCustom = new MoveCustom();

        moveCustom.setMoveNumber(move.getMoveNumber());

        moveCustom.setWhitePiece(move.getWhitePiece());
        moveCustom.setWhiteColumnFrom(move.getWhiteColumnFrom());
        moveCustom.setWhiteLineFrom(move.getWhiteLineFrom());
        moveCustom.setWhiteColumnTo(move.getWhiteColumnTo());
        moveCustom.setWhiteLineTo(move.getWhiteLineTo());

        moveCustom.setBlackPiece(move.getBlackPiece());
        moveCustom.setBlackColumnFrom(move.getBlackColumnFrom());
        moveCustom.setBlackLineFrom(move.getBlackLineFrom());
        moveCustom.setBlackColumnTo(move.getBlackColumnTo());
        moveCustom.setBlackLineTo(move.getBlackLineTo());

        return moveCustom;
    }

}
