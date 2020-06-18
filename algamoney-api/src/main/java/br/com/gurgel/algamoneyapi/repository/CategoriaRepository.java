package br.com.gurgel.algamoneyapi.repository;

import br.com.gurgel.algamoneyapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
