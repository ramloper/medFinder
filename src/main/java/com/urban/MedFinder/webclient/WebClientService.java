package com.urban.MedFinder.webclient;

import com.urban.MedFinder.entity.Hospital;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class WebClientService {

    @Value("${public.key}")
    private String key;

    public List<Hospital> getHospitals() {
        // webClient 기본 설정
        WebClient webClient =
                WebClient
                        .builder()
                        .baseUrl("http://safemap.go.kr/openApiService/data/getTotHospitalData.do")
                        .build();

        // api 요청
        // bodyToMono 사용해서 Map으로 받아도 되고
        // .toEntityList 사용해서 Entity List로 바로 만들어서 받아도 될 듯 데이터 어케 올지 보고 결정하면 됨!
        Map response =
                webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("serviceKey", key)
                        .queryParam("pageNo", "1")
                        .queryParam("numOfRows", "10")
                        .queryParam("type", "JSON")
                        .build())
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        // 결과 확인
        log.info(response.toString());
        return null;
    }
}
