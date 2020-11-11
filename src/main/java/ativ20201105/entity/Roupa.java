package ativ20201105.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Roupa {
	@Id
	private String id;

	private String tipoRoupa;

	@Enumerated(EnumType.STRING)
	private TipoSexo sexo;

	private String marca;

	@Enumerated(EnumType.STRING)
	private tamanhoRoupa tamanho;

	public Roupa() {
		id = UUID.randomUUID().toString();
	}

	public Roupa(String tipo, TipoSexo sexo, String marca, tamanhoRoupa tamanho) {
		this();
		this.tipoRoupa = tipo;
		this.sexo = sexo;
		this.marca = marca;
		this.tamanho = tamanho;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoRoupa() {
		return tipoRoupa;
	}

	public void setTipoRoupa(String tipo) {
		this.tipoRoupa = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public tamanhoRoupa getTamanho() {
		return tamanho;
	}

	public void setTamanho(tamanhoRoupa tamanho) {
		this.tamanho = tamanho;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return id;
	}

}
