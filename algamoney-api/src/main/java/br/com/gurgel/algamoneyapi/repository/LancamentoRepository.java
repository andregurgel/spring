package br.com.gurgel.algamoneyapi.repository;

import br.com.gurgel.algamoneyapi.model.Lancamento;
import br.com.gurgel.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
