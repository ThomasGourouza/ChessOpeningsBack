package com.cavalierfou.chessopenings.repository;

import com.cavalierfou.chessopenings.entity.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveJpaRepository extends JpaRepository<Move, Long> {
    
}