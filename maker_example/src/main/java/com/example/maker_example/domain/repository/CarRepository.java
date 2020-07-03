package com.example.maker_example.domain.repository;

import com.example.maker_example.domain.models.Car;
import com.github.gustavovitor.maker.repository.RepositoryMaker;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends RepositoryMaker<Car, Long> {
}
