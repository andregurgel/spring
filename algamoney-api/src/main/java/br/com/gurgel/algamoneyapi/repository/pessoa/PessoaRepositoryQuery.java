package br.com.gurgel.algamoneyapi.repository.pessoa;

import br.com.gurgel.algamoneyapi.model.Pessoa;
import br.com.gurgel.algamoneyapi.repository.filter.PessoaFilter;

import java.util.List;

public interface PessoaRepositoryQuery {
    public List<Pessoa> filtrar(PessoaFilter pessoaFilter);
}
