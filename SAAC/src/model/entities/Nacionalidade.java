package model.entities;

import java.io.Serializable;

public class Nacionalidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nacionalidade;
	private int Pais;
	private int id;
	
	public Nacionalidade() {
		super();
	}
	
	public Nacionalidade(String nacionalidade, int pais, int id) {
		super();
		this.nacionalidade = nacionalidade;
		Pais = pais;
		this.id = id;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getPais() {
		return Pais;
	}
	public void setPais(int pais) {
		Pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nacionalidade other = (Nacionalidade) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
