package br.edu.up.catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.up.catalogo.entity.Evento;
import br.edu.up.catalogo.repository.EventoRepository;

public class EventoService implements IEventoService{
	
	@Autowired
	private EventoRepository repository;

	@Override
	public List<Evento> findByNumPeople(int num) {
		List<Evento> eventos = repository.findByNumPeople(num);
		return eventos;
	}

	@Override
	public Iterable<Evento> findAll(){
		Iterable<Evento> list = repository.findAll();
		return list;
	}
	
	@Override
	public Evento save(Evento entity) {
		return repository.save(entity);
	}
	
	@Override
	public Evento delete(Integer id) {
		Evento entity = repository.getOne(id);
		repository.delete(entity);
		return entity;
	}

	@Override
	public Evento getOne(Integer id) {
		Evento entity = repository.getOne(id);
		return entity;
	}
}
