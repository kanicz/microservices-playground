package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebappController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value = "/")
    public ModelAndView index() {
        return new ModelAndView("index", "cities", weatherService.getWeather());
    }

}
