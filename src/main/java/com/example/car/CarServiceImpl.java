package com.example.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository repository;

    @Override
    public CarEntity save(CarEntity entity) {
        return repository.save(entity);
    }
}
