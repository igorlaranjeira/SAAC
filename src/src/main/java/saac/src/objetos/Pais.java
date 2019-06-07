package saac.src.objetos;


public class Pais {
	public String NomePais;
	public Integer PaisVisto;
	public boolean PessoAccept;
	
	public Pais(String nomePais, Integer paisVisto, boolean pessoAccept) {
		super();
		NomePais = nomePais;
		PaisVisto = paisVisto;
		PessoAccept = pessoAccept;
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
	
	
}
