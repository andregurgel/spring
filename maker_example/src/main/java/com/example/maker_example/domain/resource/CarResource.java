package com.example.maker_example.domain.resource;

import com.example.maker_example.domain.models.Car;
import com.example.maker_example.domain.service.CarService;
import com.github.gustavovitor.maker.resource.ResourceMaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarResource extends ResourceMaker<CarService, Car, Long, Car> {

}
