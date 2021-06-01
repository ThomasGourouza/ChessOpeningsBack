package com.cavalierfou.chessopenings.repository;

import java.util.List;

import com.cavalierfou.chessopenings.entity.Opening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpeningJpaRepository extends JpaRepository<Opening, Long> {

    List<Opening> findByNameContainingIgnoreCase(String name);
    
}