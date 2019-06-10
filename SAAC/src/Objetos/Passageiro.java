package Objetos;
import java.sql.Date;

public class Passageiro {
	private	String	passaporte;
	private	String	nomePassageiro;
	private	Date	dataNascimento;
	private Boolean visto;
	private	String	cpf;
	private	String	identidade;
	
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