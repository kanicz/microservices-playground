package com.futureprocessing;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping
    public ResponseEntity rootResource() {
        return new ResponseEntity("Some hardcoded value", HttpStatus.OK);
    }
}
