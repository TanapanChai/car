package com.example.car.toyota;


import com.example.car.CarEntity;
import com.example.car.CarRepository;
import com.example.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/camry")
public class CamryController {

    @Autowired
    CamryService service;

    @Autowired
    CarRepository carRepository;

    @Autowired
    CarService carService;

    @RequestMapping(value = "/run", method = {RequestMethod.GET})
    public String run() {
        return service.run();
    }

    @RequestMapping(value = "/left", method = {RequestMethod.GET})
    public String turnLeft() {
        return service.turnLeft();
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public Iterable<CarEntity> getAll() {
        return carRepository.findAll();
    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public CarEntity add(@RequestBody CarEntity entity) {
        return carService.save(entity);
    }


}
