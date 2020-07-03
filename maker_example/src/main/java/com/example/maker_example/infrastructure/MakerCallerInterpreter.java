package com.example.maker_example.infrastructure;

import com.example.maker_example.domain.models.PrimaryEntity;
import com.github.gustavovitor.maker.GenericCallerInterpreter;
import com.github.gustavovitor.maker.repository.RepositoryMaker;
import com.github.gustavovitor.maker.service.ServiceMaker;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MakerCallerInterpreter implements GenericCallerInterpreter {


    @Override
    public void onInsert(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Object o) {
        if (o.getClass().getSuperclass().equals(PrimaryEntity.class)) {
            ((PrimaryEntity) o).setUserAudit("André");
        }
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
