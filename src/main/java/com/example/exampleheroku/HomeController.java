package com.example.exampleheroku;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "/")
    public ResponseEntity<Object> test(){

        return new ResponseEntity<>("Welcome to the heroku test auto deploy on push to master",HttpStatus.OK);
    }
}
