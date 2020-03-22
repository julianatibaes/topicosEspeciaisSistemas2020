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

import br.edu.up.catalogo.model.Responsavel;
import br.edu.up.catalogo.repository.ResponsavelRepository;

@RestController
@RequestMapping("/responsavel")
public class ResponsavelController {
	
	@Autowired
	private ResponsavelRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Responsavel> listAll() {
		Iterable<Responsavel> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Responsavel getById(@PathVariable Integer id) {
		Responsavel responsavel = repository.getOne(id);
		return responsavel;
	}
	
	@PostMapping()
	public Responsavel add(@RequestBody @Valid Responsavel responsavel) {
		return repository.save(responsavel);
	}

	@DeleteMapping("/{id}")
	public Responsavel delete(@PathVariable Integer id) {
		Responsavel responsavel = repository.getOne(id);
		repository.delete(responsavel);
		return responsavel;
	}
}
