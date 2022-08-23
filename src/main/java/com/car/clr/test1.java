package com.car.clr;

import com.car.beans.Car;
import com.car.util.TablePrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//@Component
@Order(1)
@RequiredArgsConstructor
public class test1 implements CommandLineRunner {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";
    private final List<Car> results;

    @Override
    public void run(String... args) throws Exception {
        results.clear();
        String data = restTemplate.getForObject(url+5638330,String.class);
        System.out.println(data);
        JSONArray records = new JSONObject(data).getJSONObject("result").getJSONArray("records");
//        for (int counter=0;counter<records.length();counter++){
//            String single = records.get(counter).toString();
//            System.out.println(single);
//        }
        for (Object item : records){
            results.add(objectMapper.readValue(item.toString(),Car.class));
        }
        TablePrinter.print(results);

    }
}
