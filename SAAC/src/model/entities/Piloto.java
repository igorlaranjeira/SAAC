package model.entities;
import java.io.Serializable;
import java.sql.Date;

public class Piloto implements Serializable{

	private static final long serialVersionUID = 1L;
	private	String	passaportePiloto;
	private	String	nomePiloto;
	private	Date	dataNascPiloto;
	private Boolean vistoPiloto;
	private	String	identidadePiloto;
	private	String	cpfPiloto;
	private int idPiloto;
	
	public Piloto() {
		return;
	}
	
	public Piloto(String passaportePiloto, String nomePiloto, Date dataNascPiloto, Boolean vistoPiloto,
			String identidadePiloto, String cpfPiloto, int idPiloto) {
		super();
		this.passaportePiloto = passaportePiloto;
		this.nomePiloto = nomePiloto;
		this.dataNascPiloto = dataNascPiloto;
		this.vistoPiloto = vistoPiloto;
		this.identidadePiloto = identidadePiloto;
		this.cpfPiloto = cpfPiloto;
		this.idPiloto = idPiloto;
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

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPiloto;
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
		Piloto other = (Piloto) obj;
		if (idPiloto != other.idPiloto)
			return false;
		return true;
	}
	
	
}
