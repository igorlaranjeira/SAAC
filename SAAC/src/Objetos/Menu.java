package Objetos;


import util.Conexao;

public class Menu {

	public static void main(String[] args) {
		System.out.print("Teste sem maven no git :)");
		Conexao a = new Conexao("postgresql", "localhost", "5432", "a1", "postgres", "leolindo");
		a.conect();
		

	}

}
