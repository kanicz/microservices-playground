package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeatherServiceController {

    @RequestMapping("/weather")
    public ResponseEntity<Map<String, String>> getWeather() {
        Map<String, String> cities = new HashMap<>();
        cities.put("London", "14°C, Cloudy");
        cities.put("Paris", "16°C, Cloudy");
        cities.put("Barcelona", "25°C, Sunny");
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
}
