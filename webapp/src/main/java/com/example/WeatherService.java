package com.example;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherService {

    @Autowired
    private WeatherServiceClient weatherServiceClient;

    @HystrixCommand(fallbackMethod = "getDefaultWeather")
    public Map<String, String> getWeather() {
        return weatherServiceClient.getWeather();
    }

    public Map<String, String> getDefaultWeather() {
        Map<String, String> cities = new HashMap<>();
        cities.put("London", "7°C, Cloudy");
        cities.put("Paris", "7°C, Cloudy");
        cities.put("Barcelona", "7°C, Sunny");
        return cities;
    }
}
