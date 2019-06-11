package model.entities;
import java.io.Serializable;
import java.sql.Date;

public class Comissario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private	String	passaporteComi;
	private	String	nomeComissario;
	private	Date	dataNascComissario;
	private Boolean vistoComissario;
	private	String	idComissario;
	private	String	cpfComissario;
	
	public Comissario() {
		return;
	}

	public Comissario(String passaporteComi, String nomeComissario, Date dataNascComissario, Boolean vistoComissario,
			String idComissario, String cpfComissario) {
		super();
		this.passaporteComi = passaporteComi;
		this.nomeComissario = nomeComissario;
		this.dataNascComissario = dataNascComissario;
		this.vistoComissario = vistoComissario;
		this.idComissario = idComissario;
		this.cpfComissario = cpfComissario;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idComissario == null) ? 0 : idComissario.hashCode());
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
		Comissario other = (Comissario) obj;
		if (idComissario == null) {
			if (other.idComissario != null)
				return false;
		} else if (!idComissario.equals(other.idComissario))
			return false;
		return true;
	}

}
