package model.entities;

import java.io.Serializable;

public class Visto implements Serializable{

	private static final long serialVersionUID = 1L;
	private String visto;
	private int id;

	
	
	public Visto() {
		
	}
	
	public Visto(String visto, int id) {
		super();
		this.visto = visto;
		this.id = id;
	}

	

	public String getVisto() {
		return visto;
	}

	public void setVisto(String visto) {
		this.visto = visto;
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
		Visto other = (Visto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
