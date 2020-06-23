package br.com.gurgel.algamoneyapi.repository.pessoa;

import br.com.gurgel.algamoneyapi.model.Pessoa;
import br.com.gurgel.algamoneyapi.repository.filter.PessoaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PessoaRepositoryQuery {
    public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
}
