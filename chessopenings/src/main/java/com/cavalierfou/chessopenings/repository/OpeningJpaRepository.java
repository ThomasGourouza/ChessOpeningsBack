package com.cavalierfou.chessopenings.repository;

import com.cavalierfou.chessopenings.entity.Opening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpeningJpaRepository extends JpaRepository<Opening, Long> {
    
}