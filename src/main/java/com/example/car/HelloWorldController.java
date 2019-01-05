package com.example.car;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/helloWorld", method = {RequestMethod.GET})
    public String helloWorld() {
        return "helloWorld";
    }
}
