package Objetos;


public class Passaporte {
	public String NomePassageiro;
	public Integer NumeroPassaporte;
	public Integer PaisesVisto;
	public String NacionalidadePassageiro;
	public boolean PassaportPiloto;
	public String NomePiloto;
	public Integer NumeroPiloto;
	public Integer PaisVistoPiloto;
	
	
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
	
	
}
