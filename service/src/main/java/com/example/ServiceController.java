package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/welcome")
    public ResponseEntity<String> getWelcomeMessage() {
        return new ResponseEntity<String>("siemka", HttpStatus.OK);
    }
}
