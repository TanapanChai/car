package com.example.car.toyota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/altis")
public class AltisController {

    @Autowired
    AltisService service;

    @RequestMapping(value = "/run", method = {RequestMethod.GET})
    public String run() {
        return service.run();
    }

    @RequestMapping(value = "/left", method = {RequestMethod.GET})
    public String turnLeft() {
        return service.turnLeft();
    }
}
