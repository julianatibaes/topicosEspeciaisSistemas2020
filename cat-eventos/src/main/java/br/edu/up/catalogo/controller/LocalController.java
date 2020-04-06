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

import br.edu.up.catalogo.entity.Local;
import br.edu.up.catalogo.repository.LocalRepository;

@RestController
@RequestMapping("local")
public class LocalController {

	@Autowired
	private LocalRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Local> listAll(){
		Iterable<Local> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Local getById(@PathVariable Integer id) {
		Local entity = repository.getOne(id);
		return entity;
	}
	
	@PostMapping
	public Local add(@RequestBody @Valid Local entity) {
		return repository.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public Local delete(@PathVariable Integer id) {
		Local entity = repository.getOne(id);
		repository.delete(entity);
		return entity;
	}
}
