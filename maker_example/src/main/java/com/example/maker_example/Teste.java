package com.example.maker_example;

import com.github.gustavovitor.maker.GenericCallerInterpreter;
import com.github.gustavovitor.maker.repository.RepositoryMaker;
import com.github.gustavovitor.maker.service.ServiceMaker;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Teste implements GenericCallerInterpreter {
    @Override
    public void onInsert(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Object o) {

    }

    @Override
    public void onUpdate(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Object o, Object o1) {

    }

    @Override
    public void onPatch(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Object o, Map<String, Object> map) {

    }

    @Override
    public void onDelete(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Object o) {

    }
}
