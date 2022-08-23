package com.car.controller;

import com.car.exception.NotFoundException;
import com.car.services.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/car")
    public ResponseEntity<?> getByCarNumber(@PathVariable long number) throws NotFoundException, JsonProcessingException {
        return new ResponseEntity<>(carService.getByIdPlate(number), HttpStatus.OK);
    }
}
