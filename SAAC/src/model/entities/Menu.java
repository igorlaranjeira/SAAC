package model.entities;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;
import model.dao.AeronaveDao;
import model.dao.DaoFactory;



public class Menu {

	public static void main(String[] args) {
		Connection conn = null;
		java.sql.Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT id_pass,nm_passag FROM passageiro");
			
			while(rs.next()) {
				System.out.println("Numero do cartao: "+rs.getInt("id_pass")+"\tNome: "+rs.getString("nm_passag"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
		AeronaveDao aaa = DaoFactory.createAeronaveDao();
    }	
		

}


