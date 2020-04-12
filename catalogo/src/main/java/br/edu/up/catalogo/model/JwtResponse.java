package br.edu.up.catalogo.model;

import java.io.Serializable;

/**
 * 
 * @author Juliana
 * 
 * Essa classe é necessária para criar uma resposta contendo o JWT a ser retornado ao usuário.
 *
 */
public class JwtResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5057300247093311916L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

}
