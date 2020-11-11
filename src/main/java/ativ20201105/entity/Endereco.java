package ativ20201105.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	private String id;

	@Enumerated(EnumType.STRING)
	private TipoLogradouro tipo;

	private String nome;
	private String numero;

	public Endereco() {
		id = UUID.randomUUID().toString();
	}

	public Endereco(TipoLogradouro tipo, String nome, String numero) {
		this();
		this.tipo = tipo;
		this.nome = nome;
		this.numero = numero;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoLogradouro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLogradouro tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return id;
	}

}
