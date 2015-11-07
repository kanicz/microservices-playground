package com.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {

    @Value("${welcome.string}")
    private String welcomeMessage;

    @Value("${hostname:N/A}")
    private String hostname;

    @RequestMapping(value = "/")
    public ResponseEntity<String> rootResource() {
        return new ResponseEntity<String>(welcomeMessage + " from host " + hostname, HttpStatus.OK);
    }
}
