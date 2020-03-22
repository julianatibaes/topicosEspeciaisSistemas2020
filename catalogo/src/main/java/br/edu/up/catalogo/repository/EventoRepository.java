package br.edu.up.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.catalogo.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer>{
}
