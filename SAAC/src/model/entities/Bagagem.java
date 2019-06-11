package model.entities;

import java.io.Serializable;

public class Bagagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int identicidaorBagagem;
	private String RelacaoPassageiro;
	private float Peso;
	private String NomePassageiro;
	private boolean BagagemMao;
	private Integer LocalDespacho;
	private Integer LocalRecebimento;
	private boolean Despachada;
	
	public Bagagem() {
	}
	
	public Bagagem(String relacaoPassageiro, float peso, String nomePassageiro, boolean bagagemMao,
			Integer localDespacho, Integer localRecebimento, boolean despachada) {
		super();
		RelacaoPassageiro = relacaoPassageiro;
		Peso = peso;
		NomePassageiro = nomePassageiro;
		BagagemMao = bagagemMao;
		LocalDespacho = localDespacho;
		LocalRecebimento = localRecebimento;
		Despachada = despachada;
	}
	
	public String getRelacaoPassageiro() {
		return RelacaoPassageiro;
	}
	public void setRelacaoPassageiro(String relacaoPassageiro) {
		RelacaoPassageiro = relacaoPassageiro;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public String getNomePassageiro() {
		return NomePassageiro;
	}
	public void setNomePassageiro(String nomePassageiro) {
		NomePassageiro = nomePassageiro;
	}
	public boolean isBagagemMao() {
		return BagagemMao;
	}
	public void setBagagemMao(boolean bagagemMao) {
		BagagemMao = bagagemMao;
	}
	public Integer getLocalDespacho() {
		return LocalDespacho;
	}
	public void setLocalDespacho(Integer localDespacho) {
		LocalDespacho = localDespacho;
	}
	public Integer getLocalRecebimento() {
		return LocalRecebimento;
	}
	public void setLocalRecebimento(Integer localRecebimento) {
		LocalRecebimento = localRecebimento;
	}
	public boolean isDespachada() {
		return Despachada;
	}
	public void setDespachada(boolean despachada) {
		Despachada = despachada;
	}

	public int getIdenticidaorBagagem() {
		return identicidaorBagagem;
	}

	public void setIdenticidaorBagagem(int identicidaorBagagem) {
		this.identicidaorBagagem = identicidaorBagagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identicidaorBagagem;
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
		Bagagem other = (Bagagem) obj;
		if (identicidaorBagagem != other.identicidaorBagagem)
			return false;
		return true;
	}
	
	
}
