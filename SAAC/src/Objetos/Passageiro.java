package Objetos;
import java.sql.Date;

public class Passageiro {
	public	String	passaporte;
	public	String	nomePassageiro;
	public	Date	dataNascimento;
	private Boolean visto;
	public	String	cpf;
	public	String	identidade;
	
	public Passageiro() {
		return;
	}
	
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	public String getNomePassageiro() {
		return nomePassageiro;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public Boolean getVisto() {
		return visto;
	}
	public void setVisto(Boolean visto) {
		this.visto = visto;
	}
	public String getCpf() {
		return cpf;
	}
	public String getIdentidade() {
		return identidade;
	}	
}