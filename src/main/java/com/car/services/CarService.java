package com.car.services;

import com.car.beans.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";
    private final List<Car> results;

    



}
