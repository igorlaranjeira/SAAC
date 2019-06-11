package model.entities;

import java.io.Serializable;

public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	private int identicidador;
	
public Login() {
	// TODO Auto-generated constructor stub
}

public Login(String login, String senha, int identicidador) {
	super();
	this.login = login;
	this.senha = senha;
	this.identicidador = identicidador;
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

private int getIdenticidador() {
	return identicidador;
}

private void setIdenticidador(int identicidador) {
	this.identicidador = identicidador;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + identicidador;
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
	Login other = (Login) obj;
	if (identicidador != other.identicidador)
		return false;
	return true;
}


}
