package com.example.maker_example.domain.service;

import com.example.maker_example.domain.models.Car;
import com.example.maker_example.domain.repository.specification.CarSpecification;
import com.github.gustavovitor.maker.repository.RepositoryMaker;
import com.github.gustavovitor.maker.service.ServiceMaker;
import org.springframework.stereotype.Service;

@Service
public class CarService extends ServiceMaker<RepositoryMaker, Car, Long, Car, CarSpecification> {
}
