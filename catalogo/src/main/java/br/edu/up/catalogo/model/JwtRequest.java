package br.edu.up.catalogo.model;

import java.io.Serializable;

/**
 * 
 * @author Juliana
 * 
 * Essa classe é necessária para armazenar o nome de usuário e a senha que recebemos do cliente.
 *
 */
public class JwtRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8616203758685096281L;

	private String username;
	private String password;

	public JwtRequest()
	{
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
	return this.username;
	}

	public void setUsername(String username) {
	this.username = username;
	}

	public String getPassword() {
	return this.password;
	}

	public void setPassword(String password) {
	this.password = password;
	}

}
