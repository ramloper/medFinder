package com.urban.MedFinder.service;

import com.urban.MedFinder.dto.request.UserRequest;
import com.urban.MedFinder.dto.response.UserResponse;
import com.urban.MedFinder.entity.User;
import com.urban.MedFinder.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(UserRequest userRequest){
        User user = new User();

        User user2 = User.builder()
                .name(userRequest.getName())
                .phoneNumber(userRequest.getPhoneNumber())
                .build();
        return user2;
    }
}
