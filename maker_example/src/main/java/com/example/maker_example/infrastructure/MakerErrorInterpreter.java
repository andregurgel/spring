package com.example.maker_example.infrastructure;

import com.github.gustavovitor.maker.GenericErrorInterpreter;
import com.github.gustavovitor.maker.repository.RepositoryMaker;
import com.github.gustavovitor.maker.service.ServiceMaker;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Map;

@Service
public class MakerErrorInterpreter implements GenericErrorInterpreter {

    @Override
    public void onInsertError(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Throwable throwable, Object o) {
        if (throwable instanceof DataIntegrityViolationException) {
            System.out.println("O usuário está inserindo uma entidade que já existe.");
            System.out.println("Entidade: ".concat(o.toString()));
        }
    }

    @Override
    public void onUpdateError(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Throwable throwable, Object o, Object o1) {

    }

    @Override
    public void onPatchError(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Throwable throwable, Object o, Map<String, Object> map) {

    }

    @Override
    public void onDeleteError(ServiceMaker serviceMaker, RepositoryMaker repositoryMaker, Throwable throwable, Object o) {

    }
}
