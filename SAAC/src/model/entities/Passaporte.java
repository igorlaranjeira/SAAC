package model.entities;

import java.io.Serializable;

public class Passaporte implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String NomePassageiro;
	private Integer NumeroPassaporte;
	private Integer PaisesVisto;
	private String NacionalidadePassageiro;
	private boolean PassaportPiloto;
	private String NomePiloto;
	private Integer NumeroPiloto;
	private Integer PaisVistoPiloto;
	private int idPassaporte;
	
	public Passaporte() {
	}
	
	public Passaporte(String nomePassageiro, Integer numeroPassaporte, Integer paisesVisto, String nacionalidadePassageiro,
			boolean passaportPiloto, String nomePiloto, Integer numeroPiloto, Integer paisVistoPiloto) {
		super();
		NomePassageiro = nomePassageiro;
		NumeroPassaporte = numeroPassaporte;
		PaisesVisto = paisesVisto;
		NacionalidadePassageiro = nacionalidadePassageiro;
		PassaportPiloto = passaportPiloto;
		NomePiloto = nomePiloto;
		NumeroPiloto = numeroPiloto;
		PaisVistoPiloto = paisVistoPiloto;
	}
	public String getNomePassageiro() {
		return NomePassageiro;
	}
	public void setNomePassageiro(String nomePassageiro) {
		NomePassageiro = nomePassageiro;
	}
	public Integer getNumeroPassaporte() {
		return NumeroPassaporte;
	}
	public void setNumeroPassaporte(Integer numeroPassaporte) {
		NumeroPassaporte = numeroPassaporte;
	}
	public Integer getPaisesVisto() {
		return PaisesVisto;
	}
	public void setPaisesVisto(Integer paisesVisto) {
		PaisesVisto = paisesVisto;
	}
	public String getNacionalidadePassageiro() {
		return NacionalidadePassageiro;
	}
	public void setNacionalidadePassageiro(String nacionalidadePassageiro) {
		NacionalidadePassageiro = nacionalidadePassageiro;
	}
	public boolean isPassaportPiloto() {
		return PassaportPiloto;
	}
	public void setPassaportPiloto(boolean passaportPiloto) {
		PassaportPiloto = passaportPiloto;
	}
	public String getNomePiloto() {
		return NomePiloto;
	}
	public void setNomePiloto(String nomePiloto) {
		NomePiloto = nomePiloto;
	}
	public Integer getNumeroPiloto() {
		return NumeroPiloto;
	}
	public void setNumeroPiloto(Integer numeroPiloto) {
		NumeroPiloto = numeroPiloto;
	}
	public Integer getPaisVistoPiloto() {
		return PaisVistoPiloto;
	}
	public void setPaisVistoPiloto(Integer paisVistoPiloto) {
		PaisVistoPiloto = paisVistoPiloto;
	}

	public int getIdPassaporte() {
		return idPassaporte;
	}

	public void setIdPassaporte(int idPassaporte) {
		this.idPassaporte = idPassaporte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPassaporte;
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
		Passaporte other = (Passaporte) obj;
		if (idPassaporte != other.idPassaporte)
			return false;
		return true;
	}
	
	
}
