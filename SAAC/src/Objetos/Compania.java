package Objetos;
public class Compania {
	public String NomeCompania;
	public int IdentificadorCompania;
	
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
	
	
	
	
}
