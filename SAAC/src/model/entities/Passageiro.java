package model.entities;
import java.io.Serializable;
import java.sql.Date;

public class Passageiro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private	String	passaporte;
	private	String	nomePassageiro;
	private	Date	dataNascimento;
	private Boolean visto;
	private	String	cpf;
	private	String	identidade;
	private int idPassageiro;
	private int nacionalidade;
	
	public Passageiro() {
		return;
	}
	
	
	


	public Passageiro(String passaporte, String nomePassageiro, Date dataNascimento, Boolean visto, String cpf,
			String identidade, int idPassageiro, int nacionalidade) {
		super();
		this.passaporte = passaporte;
		this.nomePassageiro = nomePassageiro;
		this.dataNascimento = dataNascimento;
		this.visto = visto;
		this.cpf = cpf;
		this.identidade = identidade;
		this.idPassageiro = idPassageiro;
		this.nacionalidade = nacionalidade;
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


	public int getIdPassageiro() {
		return idPassageiro;
	}


	public void setIdPassageiro(int idPassageiro) {
		this.idPassageiro = idPassageiro;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPassageiro;
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
		Passageiro other = (Passageiro) obj;
		if (idPassageiro != other.idPassageiro)
			return false;
		return true;
	}


	public int getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(int nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}