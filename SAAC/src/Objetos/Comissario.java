package Objetos;
import java.sql.Date;

public class Comissario {
	private	String	passaporteComi;
	private	String	nomeComissario;
	private	Date	dataNascComissario;
	private Boolean vistoComissario;
	private	String	idComissario;
	private	String	cpfComissario;
	
	public Comissario() {
		return;
	}

	public String getPassaporteComi() {
		return passaporteComi;
	}
	public void setPassaporteComi(String passaporteComi) {
		this.passaporteComi = passaporteComi;
	}
	public Boolean getVistoComissario() {
		return vistoComissario;
	}
	public void setVistoComissario(Boolean vistoComissario) {
		this.vistoComissario = vistoComissario;
	}
	public String getNomeComissario() {
		return nomeComissario;
	}
	public Date getDataNascComissario() {
		return dataNascComissario;
	}
	public String getIdComissario() {
		return idComissario;
	}
	public String getCpfComissario() {
		return cpfComissario;
	}

}
