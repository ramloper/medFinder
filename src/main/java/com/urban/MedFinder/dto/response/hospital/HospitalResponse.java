package com.urban.MedFinder.dto.response.hospital;

import com.urban.MedFinder.entity.Hospital;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

public class HospitalResponse {

    @Getter
    @Builder
    public static class getList {
        private String hospitalName;
        private Boolean isArriveBeforeClosing;

        public static getList toDTO(Boolean isArriveBeforeClosing, String visitPossible){
            return getList.builder()
                    .isArriveBeforeClosing(isArriveBeforeClosing)
                    .build();
        }
    }
}
