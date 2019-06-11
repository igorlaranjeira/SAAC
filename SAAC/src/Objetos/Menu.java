package Objetos;

import java.sql.Connection;

import db.DB;

public class Menu {

	public static void main(String[] args) {
		//test ConnectionS
		Connection conn = DB.getConnection();
		DB.closeConnection();
    }
		

}


