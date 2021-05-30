package com.cavalierfou.chessopenings.service;

import java.util.Optional;
import com.cavalierfou.chessopenings.entity.Opening;
import com.cavalierfou.chessopenings.repository.OpeningJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpeningService {

    @Autowired
    private OpeningJpaRepository openingJpaRepository;


    public Opening findById(Long id) {
        Optional<Opening> existingOpeningOptional = openingJpaRepository.findById(id);
        if (existingOpeningOptional.isPresent()) {
            return existingOpeningOptional.get();
        } else {
            return null;
        }
    }

}
