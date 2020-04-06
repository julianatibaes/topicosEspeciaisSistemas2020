package br.edu.up.catalogo.service;

import java.util.List;

import br.edu.up.catalogo.entity.Evento;

public interface IEventoService {
	
	List<Evento> findByNumPeople(int num);
	Iterable<Evento> findAll();
	Evento getOne(Integer id);
	Evento save(Evento entity);
	Evento delete(Integer id);

}
