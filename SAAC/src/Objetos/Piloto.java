package Objetos;
import java.sql.Date;

public class Piloto {

	private	String	passaportePiloto;
	private	String	nomePiloto;
	private	Date	dataNascPiloto;
	private Boolean vistoPiloto;
	private	String	identidadePiloto;
	private	String	cpfPiloto;
	
	public Piloto() {
		return;
	}
	
	public String getPassaportePiloto() {
		return passaportePiloto;
	}
	public void setPassaportePiloto(String passaportePiloto) {
		this.passaportePiloto = passaportePiloto;
	}
	public Boolean getVistoPiloto() {
		return vistoPiloto;
	}
	public void setVistoPiloto(Boolean vistoPiloto) {
		this.vistoPiloto = vistoPiloto;
	}
	public String getNomePiloto() {
		return nomePiloto;
	}
	public Date getDataNascPiloto() {
		return dataNascPiloto;
	}
	public String getIdentidadePiloto() {
		return identidadePiloto;
	}
	public String getCpfPiloto() {
		return cpfPiloto;
	}
	
	
}
