package br.edu.up.catalogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.up.catalogo.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer>{
	
	@Query("SELECT e from Evento WHERE e.numPessoasConfirmadas like %?1")
	List<Evento> findByNumPeople(int num);

}
