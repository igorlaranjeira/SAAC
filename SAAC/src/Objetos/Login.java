package Objetos;

public class Login {
	private String login;
	private String senha;
	private int hash;
	
	private void setHash(int hash) {
		this.hash = hash;
	}

	public Login() {
		// TODO Auto-generated constructor stub
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
	
	
}
