package br.com.gurgel.algamoneyapi.service;

import br.com.gurgel.algamoneyapi.model.Categoria;
import br.com.gurgel.algamoneyapi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarCategoriaPeloCodigo(Long codigo) {
        Optional<Categoria> categoriaSalva = categoriaRepository.findById(codigo);
        if (!categoriaSalva.isPresent()){
            throw new EmptyResultDataAccessException(1);
        }
        return categoriaSalva.get();
    }
}
