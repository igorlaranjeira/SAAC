package model.entities;

import java.io.Serializable;

public class Pais implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String NomePais;
	private Integer PaisVisto;
	private boolean PessoAccept;
	private int idPais;
	
	public Pais() {
		super();
	}
	
	public Pais(String nomePais, Integer paisVisto, boolean pessoAccept, int idPais) {
		super();
		NomePais = nomePais;
		PaisVisto = paisVisto;
		PessoAccept = pessoAccept;
		this.idPais = idPais;
	}


	public String getNomePais() {
		return NomePais;
	}
	public void setNomePais(String nomePais) {
		NomePais = nomePais;
	}
	public Integer getPaisVisto() {
		return PaisVisto;
	}
	public void setPaisVisto(Integer paisVisto) {
		PaisVisto = paisVisto;
	}
	public boolean isPessoAccept() {
		return PessoAccept;
	}
	public void setPessoAccept(boolean pessoAccept) {
		PessoAccept = pessoAccept;
	}


	public int getIdPais() {
		return idPais;
	}


	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPais;
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
		Pais other = (Pais) obj;
		if (idPais != other.idPais)
			return false;
		return true;
	}
	
	
}
