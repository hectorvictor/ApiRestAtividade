package ativ20201105.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Loja {
	@Id
	private String id;

	private String nome;
	private String cnpj;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL)
	private List<Roupa> roupas = new ArrayList<>();

	public Loja() {
		id = UUID.randomUUID().toString();
	}

	public Loja(String nome, String cnpj) {
		this();
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void addEnderecos(Endereco end) {
		enderecos.add(end);
	}

	public List<Roupa> getRoupas() {
		return roupas;
	}

	public void addRoupas(Roupa r) {
		roupas.add(r);
	}

	@Override
	public String toString() {
		return id;
	}

}
