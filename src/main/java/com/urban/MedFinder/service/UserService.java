package com.urban.MedFinder.service;

import com.urban.MedFinder.dto.request.user.UserRequest;
import com.urban.MedFinder.entity.User;
import com.urban.MedFinder.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}
