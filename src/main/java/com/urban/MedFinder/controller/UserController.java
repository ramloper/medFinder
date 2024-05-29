package com.urban.MedFinder.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/user/create")
    public ResponseEntity<?> getInsert(){
        return ResponseEntity.ok().body(null);
    }
}
