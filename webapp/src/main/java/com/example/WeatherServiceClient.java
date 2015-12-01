package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "weather-service")
public interface WeatherServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    Map<String, String> getWeather();
}
