package com.urban.MedFinder.controller;


import com.urban.MedFinder.dto.request.user.UserRequest;
import com.urban.MedFinder.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/create")
    public ResponseEntity<?> getInsert(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok().body(null);
    }
}
