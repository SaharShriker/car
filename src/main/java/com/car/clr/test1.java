package com.car.clr;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Order(1)
@RequiredArgsConstructor
public class test1 implements CommandLineRunner {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";

    @Override
    public void run(String... args) throws Exception {
        String data = restTemplate.getForObject(url+5638330,String.class);
        System.out.println(data);
    }
}
