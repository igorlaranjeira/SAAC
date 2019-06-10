package util;

import java.sql.*;

public class Conexao {
	public String url = "jdbc:postgresql://localhost:5432/a1";
	public String senha = "leogay";
	public String usuario = "postgres";
	
	
	public Conexao() {
		try {
		    Class.forName("org.postgresql.Driver");
		    Connection conexao = DriverManager.getConnection(url, usuario, senha);
		    
		} catch (ClassNotFoundException e1) {
		    e1.printStackTrace();
		    
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
}
