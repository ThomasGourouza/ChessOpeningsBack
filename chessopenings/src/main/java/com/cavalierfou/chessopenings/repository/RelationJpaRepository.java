package com.cavalierfou.chessopenings.repository;

import com.cavalierfou.chessopenings.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationJpaRepository extends JpaRepository<Relation, Long> {
    
}