package com.cavalierfou.chessopenings.controller;

import com.cavalierfou.chessopenings.entity.Opening;
import com.cavalierfou.chessopenings.service.OpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/opening")
class OpeningController {

    @Autowired
    private OpeningService openingService;

    // @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{id}")
    public ResponseEntity<Opening> getById(@PathVariable("id") Long id) {
        var existingOpening = openingService.findById(id);
        if (existingOpening != null) {
            return new ResponseEntity<>(existingOpening, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}