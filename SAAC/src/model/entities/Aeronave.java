package model.entities;

import java.io.Serializable;

public class Aeronave implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int IdAeronave;
	private String ModAeronave;
	private double EnvAeronave;
	private double ConAeronave;
	private double BasAeronave;
	private double BitAeronave;
	private int MotoAeronave;
	private double PaxAeronave;
	private double PmdAeronave;
	private double PmaAeronave;
	private double PovAeronave;
	private double PzcAeronave;
	private double CbpAeronave;
	
	public Aeronave() {}
	
	
	public Aeronave(int idAeronave, String modAeronave, double envAeronave, double conAeronave, double basAeronave,
			double bitAeronave, int motoAeronave, double paxAeronave, double pmdAeronave, double pmaAeronave,
			double povAeronave, double pzcAeronave, double cbpAeronave) {
		super();
		IdAeronave = idAeronave;
		ModAeronave = modAeronave;
		EnvAeronave = envAeronave;
		ConAeronave = conAeronave;
		BasAeronave = basAeronave;
		BitAeronave = bitAeronave;
		MotoAeronave = motoAeronave;
		PaxAeronave = paxAeronave;
		PmdAeronave = pmdAeronave;
		PmaAeronave = pmaAeronave;
		PovAeronave = povAeronave;
		PzcAeronave = pzcAeronave;
		CbpAeronave = cbpAeronave;
	}
	
	public int getIdAeronave() {
		return IdAeronave;
	}
	public void setIdAeronave(int idAeronave) {
		IdAeronave = idAeronave;
	}
	public String getModAeronave() {
		return ModAeronave;
	}
	public void setModAeronave(String modAeronave) {
		ModAeronave = modAeronave;
	}
	public double getEnvAeronave() {
		return EnvAeronave;
	}
	public void setEnvAeronave(double envAeronave) {
		EnvAeronave = envAeronave;
	}
	public double getConAeronave() {
		return ConAeronave;
	}
	public void setConAeronave(double conAeronave) {
		ConAeronave = conAeronave;
	}
	public double getBasAeronave() {
		return BasAeronave;
	}
	public void setBasAeronave(double basAeronave) {
		BasAeronave = basAeronave;
	}
	public double getBitAeronave() {
		return BitAeronave;
	}
	public void setBitAeronave(double bitAeronave) {
		BitAeronave = bitAeronave;
	}
	public int getMotoAeronave() {
		return MotoAeronave;
	}
	public void setMotoAeronave(int motoAeronave) {
		MotoAeronave = motoAeronave;
	}
	public double getPaxAeronave() {
		return PaxAeronave;
	}
	public void setPaxAeronave(double paxAeronave) {
		PaxAeronave = paxAeronave;
	}
	public double getPmdAeronave() {
		return PmdAeronave;
	}
	public void setPmdAeronave(double pmdAeronave) {
		PmdAeronave = pmdAeronave;
	}
	public double getPmaAeronave() {
		return PmaAeronave;
	}
	public void setPmaAeronave(double pmaAeronave) {
		PmaAeronave = pmaAeronave;
	}
	public double getPovAeronave() {
		return PovAeronave;
	}
	public void setPovAeronave(double povAeronave) {
		PovAeronave = povAeronave;
	}
	public double getPzcAeronave() {
		return PzcAeronave;
	}
	public void setPzcAeronave(double pzcAeronave) {
		PzcAeronave = pzcAeronave;
	}
	public double getCbpAeronave() {
		return CbpAeronave;
	}
	public void setCbpAeronave(double cbpAeronave) {
		CbpAeronave = cbpAeronave;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdAeronave;
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
		Aeronave other = (Aeronave) obj;
		if (IdAeronave != other.IdAeronave)
			return false;
		return true;
	}
	
	
}
