package br.edu.up.catalogo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "evento")
public class Evento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "dthEventoInicio")
	private String dthEventoInicio;

	@Column(name = "dthEventoFim")
	private String dthEventoFim;
	
	@Column(name = "numPessoasPrevistas")
	private int numPessoasPrevistas;
	
	@Column(name = "numPessoasConfirmadas")
	private int numPessoasConfirmadas;
	
	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;
	
	@Column(name = "observacao")
	private String observacao;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Local local;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Responsavel responsavel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDthEventoInicio() {
		return dthEventoInicio;
	}

	public void setDthEventoInicio(String dthEventoInicio) {
		this.dthEventoInicio = dthEventoInicio;
	}

	public String getDthEventoFim() {
		return dthEventoFim;
	}

	public void setDthEventoFim(String dthEventoFim) {
		this.dthEventoFim = dthEventoFim;
	}

	public int getNumPessoasPrevistas() {
		return numPessoasPrevistas;
	}

	public void setNumPessoasPrevistas(int numPessoasPrevistas) {
		this.numPessoasPrevistas = numPessoasPrevistas;
	}

	public int getNumPessoasConfirmadas() {
		return numPessoasConfirmadas;
	}

	public void setNumPessoasConfirmadas(int numPessoasConfirmadas) {
		this.numPessoasConfirmadas = numPessoasConfirmadas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
