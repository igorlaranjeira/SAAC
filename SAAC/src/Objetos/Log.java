package Objetos;

public class Log {
	private String login;
	private String senha;
	private int hash;
	
	public Log() {
		super();
	}

	private String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		this.login = login;
	}

	private String getSenha() {
		return senha;
	}

	private void setSenha(String senha) {
		this.senha = senha;
	}

	private int getHash() {
		return hash;
	}

	private void setHash(int hash) {
		this.hash = hash;
	}
	
}
