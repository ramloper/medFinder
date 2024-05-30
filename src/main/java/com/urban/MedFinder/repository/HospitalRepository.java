package com.urban.MedFinder.repository;

import com.urban.MedFinder.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Query("select h from Hospital h where h.dutyName IN :names ")
    List<Hospital> findAllByHospitalName(@Param("names") List<String> hospitalNames);
}
