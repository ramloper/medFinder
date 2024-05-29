package com.urban.MedFinder.controller;


import com.urban.MedFinder.dto.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/user/create")
    public ResponseEntity<?> getInsert(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok().body(null);
    }
}
