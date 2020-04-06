package br.edu.up.catalogo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.catalogo.entity.Evento;
import br.edu.up.catalogo.service.IEventoService;


@RestController
@RequestMapping("evento")
public class EventoController {
		
	@Autowired IEventoService service;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Evento> listAll(){
		Iterable<Evento> list = service.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Evento getById(@PathVariable Integer id) {
		Evento entity = service.getOne(id);
		return entity;
	}
	
	@PostMapping
	public Evento add(@RequestBody @Valid Evento entity) {
		return service.save(entity);
	}
	
	@PutMapping
	public Evento update(@RequestBody @Valid Evento entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public Evento delete(@PathVariable Integer id) {
		Evento entity = service.delete(id);
		return entity;
	}
	
	@GetMapping(value = "/pesquisa_qtd_participantes/{num}", produces = "application/json")
	public @ResponseBody Iterable<Evento> listByNumPeople(@PathVariable int num){
		Iterable<Evento> list = service.findByNumPeople(num);
		return list;
	}

}
