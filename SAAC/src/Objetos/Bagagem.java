package Objetos;

public class Bagagem {
	private String RelacaoPassageiro;
	private float Peso;
	private String NomePassageiro;
	private boolean BagagemMao;
	private Integer LocalDespacho;
	private Integer LocalRecebimento;
	private boolean Despachada;
	
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
	
	
}
