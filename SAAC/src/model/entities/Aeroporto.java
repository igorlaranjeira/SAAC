package model.entities;

import java.io.Serializable;

public class Aeroporto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idAeroporto;
	private String nome;
	private float tanhoPista;
	private float alturaPista;
	private int pais;
	
	
	public Aeroporto() {
		super();
		
	}

	public Aeroporto(int idAeroporto, String nome, float tanhoPista, float alturaPista, int pais) {
		super();
		this.idAeroporto = idAeroporto;
		this.nome = nome;
		this.tanhoPista = tanhoPista;
		this.alturaPista = alturaPista;
		this.pais = pais;
	}

	public int getIdAeroporto() {
		return idAeroporto;
	}

	public void setIdAeroporto(int idAeroporto) {
		this.idAeroporto = idAeroporto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getTanhoPista() {
		return tanhoPista;
	}

	public void setTanhoPista(float tanhoPista) {
		this.tanhoPista = tanhoPista;
	}

	public float getAlturaPista() {
		return alturaPista;
	}

	public void setAlturaPista(float alturaPista) {
		this.alturaPista = alturaPista;
	}

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAeroporto;
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
		Aeroporto other = (Aeroporto) obj;
		if (idAeroporto != other.idAeroporto)
			return false;
		return true;
	}
	
}
