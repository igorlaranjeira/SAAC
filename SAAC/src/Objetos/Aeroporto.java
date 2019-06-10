package Objetos;

public class Aeroporto {
	private int idAeroporto;
	private String nome;
	private float tanhoPista;
	private float alturaPista;
	private int pais;
	
	public Aeroporto() {
		super();
		
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
	
}
