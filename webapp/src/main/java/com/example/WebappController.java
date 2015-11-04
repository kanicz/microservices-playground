package com.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebappController {

    @RequestMapping("/")
    public ResponseEntity<String> rootResource() {
        return new ResponseEntity<String>("Some hardcoded value", HttpStatus.OK);
    }
}
