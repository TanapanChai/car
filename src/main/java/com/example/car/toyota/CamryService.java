package com.example.car.toyota;

import com.example.car.CarBase;

import org.springframework.stereotype.Service;

@Service
public class CamryService extends CarBase implements ToyotaInterface {


    @Override
    public String turnLeft() {
        return "camry turn left";
    }

    @Override
    public String turnRight() {
        return "camry turn right";
    }
}
