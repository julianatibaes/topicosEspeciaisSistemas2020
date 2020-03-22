package br.edu.up.catalogo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.catalogo.model.Evento;
import br.edu.up.catalogo.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoController {

	@Autowired
	private EventoRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Evento> listAll() {
		Iterable<Evento> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Evento getById(@PathVariable Integer id) {
		Evento evento = repository.getOne(id);
		return evento;
	}
	
	@PostMapping()
	public Evento add(@RequestBody @Valid Evento evento) {
		return repository.save(evento);
	}

	@DeleteMapping("/{id}")
	public Evento delete(@PathVariable Integer id) {
		Evento evento = repository.getOne(id);
		repository.delete(evento);
		return evento;
	}
}
