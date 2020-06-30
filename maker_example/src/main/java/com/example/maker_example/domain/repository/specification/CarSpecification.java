package com.example.maker_example.domain.repository.specification;

import com.example.maker_example.domain.models.Car;
import com.github.gustavovitor.maker.repository.SpecificationBase;

import javax.management.ReflectionException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CarSpecification extends SpecificationBase<Car> {

    public CarSpecification(Car object) throws ReflectionException {
        super(object);
    }

    @Override
    public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}
