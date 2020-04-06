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

import br.edu.up.catalogo.entity.Usuario;
import br.edu.up.catalogo.repository.UsarioRepository;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsarioRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Usuario> listAll(){
		Iterable<Usuario> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Usuario getById(@PathVariable Integer id) {
		Usuario usuario = repository.getOne(id);
		return usuario;
	}
	
	@PostMapping
	public Usuario add(@RequestBody @Valid Usuario usuario) {
		return repository.save(usuario);
	}
	
	@DeleteMapping("/{id}")
	public Usuario delete(@PathVariable Integer id) {
		Usuario usuario = repository.getOne(id);
		repository.delete(usuario);
		return usuario;
	}
}
