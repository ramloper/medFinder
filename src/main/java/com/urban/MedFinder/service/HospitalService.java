package com.urban.MedFinder.service;


import com.urban.MedFinder.dto.request.hospital.HospitalRequest;
import com.urban.MedFinder.dto.response.hospital.HospitalResponse;
import com.urban.MedFinder.entity.Hospital;
import com.urban.MedFinder.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    public void insertHospitalList(List<Hospital> hospitalList){
        try {
            hospitalRepository.saveAll(hospitalList);
        }catch (Exception e){

        }
    }

    public List<HospitalResponse.getList> getHospitalList(List<HospitalRequest.HospitalInfo> hospitalInfoList){
        List<String> hospitalNameList = hospitalInfoList.stream().map(HospitalRequest.HospitalInfo::getHospitalName).toList();
        List<Hospital> hospitalListPS = hospitalRepository.findAllByHospitalName(hospitalNameList);

        return null;
    }

    private boolean canArriveBeforeClosing(LocalTime currentTime, Duration travelTime, LocalTime closingTime) {
        LocalTime arrivalTime = currentTime.plus(travelTime);
        return !arrivalTime.isAfter(closingTime);
    }

//    private List<HospitalResponse.getList> toDTOList(List<Hospital> hospitalList){
//        List<HospitalResponse.getList> returnList = new ArrayList<>();
//        hospitalList.forEach(hospital -> {
//            boolean isArriveBeforeClosing = canArriveBeforeClosing()
//            HospitalResponse.getList dto = HospitalResponse
//                    .getList
//                    .toDTO("tempName", );
//            returnList.add(dto);
//        });
//    }
}
