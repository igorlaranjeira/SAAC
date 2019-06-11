package model.entities;

import java.io.Serializable;

public class Compania  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String NomeCompania;
	private int IdentificadorCompania;
	
	public Compania() {
		super();
	}

	public Compania(String nomeCompania, int identificadorCompania) {
		super();
		NomeCompania = nomeCompania;
		IdentificadorCompania = identificadorCompania;
	}

	public String getNomeCompania() {
		return NomeCompania;
	}

	public void setNomeCompania(String nomeCompania) {
		NomeCompania = nomeCompania;
	}

	public int getIdentificadorCompania() {
		return IdentificadorCompania;
	}

	public void setIdentificadorCompania(int identificadorCompania) {
		IdentificadorCompania = identificadorCompania;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdentificadorCompania;
		result = prime * result + ((NomeCompania == null) ? 0 : NomeCompania.hashCode());
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
		Compania other = (Compania) obj;
		if (IdentificadorCompania != other.IdentificadorCompania)
			return false;
		if (NomeCompania == null) {
			if (other.NomeCompania != null)
				return false;
		} else if (!NomeCompania.equals(other.NomeCompania))
			return false;
		return true;
	}
	
	
	
	
}
