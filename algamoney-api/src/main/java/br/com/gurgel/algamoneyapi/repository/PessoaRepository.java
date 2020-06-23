package br.com.gurgel.algamoneyapi.repository;

import br.com.gurgel.algamoneyapi.model.Pessoa;
import br.com.gurgel.algamoneyapi.repository.pessoa.PessoaRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {
}
