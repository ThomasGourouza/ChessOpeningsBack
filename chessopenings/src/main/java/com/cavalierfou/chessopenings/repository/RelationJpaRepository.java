package com.cavalierfou.chessopenings.repository;

import java.util.List;

import com.cavalierfou.chessopenings.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationJpaRepository extends JpaRepository<Relation, Long> {

    public List<Relation> findByParentOpeningId(Long parentOpeningId);
    public Relation findByChildOpeningId(Long childOpeningId);
    
}