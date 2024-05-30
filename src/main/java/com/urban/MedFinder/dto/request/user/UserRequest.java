package com.urban.MedFinder.dto.request.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private Long id;
    private String name;
    private String phoneNumber;
}
