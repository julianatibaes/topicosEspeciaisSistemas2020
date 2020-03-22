package br.edu.up.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.catalogo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
}
