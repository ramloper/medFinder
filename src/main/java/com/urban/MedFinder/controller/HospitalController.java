package com.urban.MedFinder.controller;

import com.urban.MedFinder.dto.ResponseDTO;
import com.urban.MedFinder.dto.request.hospital.HospitalRequest;
import com.urban.MedFinder.service.HospitalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/hospital")
@RestController
@RequiredArgsConstructor
@Slf4j
public class HospitalController {

    private final HospitalService hospitalService;

    @GetMapping("/list")
    public ResponseEntity<?> getHospitalList(@RequestBody List<HospitalRequest.HospitalInfo> hospitalInfoList) {

        return ResponseEntity.ok().body(new ResponseDTO<>(hospitalService.getHospitalList(hospitalInfoList)));
    }
}
