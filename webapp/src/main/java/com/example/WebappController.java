package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class WebappController {

    @Autowired
    private ServiceClient serviceClient;

    @RequestMapping(value = "/")
    public ModelAndView index() {
        HashMap<String, String> cities = new HashMap<>();

        cities.put("London", "3°C, Cloudy");
        cities.put("Paris", "6°C, Cloudy");
        cities.put("Barcelona", "15°C, Sunny");
        return new ModelAndView("index", "cities", cities);
    }
}
