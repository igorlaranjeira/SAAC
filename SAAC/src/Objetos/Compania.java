package Objetos;
public class Compania {
	private String NomeCompania;
	private int IdentificadorCompania;
	
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
