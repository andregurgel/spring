package br.com.gurgel.algamoneyapi.service;

import br.com.gurgel.algamoneyapi.model.Lancamento;
import br.com.gurgel.algamoneyapi.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento buscarLancamentoPeloCodigo(Long codigo) {
        Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(codigo);
        if (!lancamentoSalvo.isPresent()){
            throw new EmptyResultDataAccessException(1);
        }
        return lancamentoSalvo.get();
    }

}
