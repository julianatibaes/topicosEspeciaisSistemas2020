package br.edu.up.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.catalogo.model.Local;

public interface LocalRepository extends JpaRepository<Local, Integer> {
}
