package com.urban.MedFinder.dto.request.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
public class HospitalRequest {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class HospitalInfo {
        private String hospitalName;
        private int takeTime;
    }
}