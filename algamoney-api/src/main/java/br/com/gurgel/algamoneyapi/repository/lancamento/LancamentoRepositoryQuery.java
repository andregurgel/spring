package br.com.gurgel.algamoneyapi.repository.lancamento;

import br.com.gurgel.algamoneyapi.model.Lancamento;
import br.com.gurgel.algamoneyapi.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
