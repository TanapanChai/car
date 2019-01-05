package com.example.car.toyota;

import com.example.car.CarBase;
import org.springframework.stereotype.Service;


@Service
public class AltisService extends CarBase implements ToyotaInterface {


    @Override
    public String turnLeft() {
        return "altis turn left";
    }

    @Override
    public String turnRight() {
        return "altis turn right";
    }
}

