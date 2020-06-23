package br.com.gurgel.algamoneyapi.service;

import br.com.gurgel.algamoneyapi.model.Lancamento;
import br.com.gurgel.algamoneyapi.model.Pessoa;
import br.com.gurgel.algamoneyapi.repository.LancamentoRepository;
import br.com.gurgel.algamoneyapi.repository.PessoaRepository;
import br.com.gurgel.algamoneyapi.service.exception.PessoaInexistenteOuInativoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento buscarLancamentoPeloCodigo(Long codigo) {
        Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(codigo);
        if (!lancamentoSalvo.isPresent()){
            throw new EmptyResultDataAccessException(1);
        }
        return lancamentoSalvo.get();
    }

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
        if (!pessoa.isPresent() || pessoa.get().isInativo()) {
            throw new PessoaInexistenteOuInativoException();
        }
        return lancamentoRepository.save(lancamento);
    }

}
