package model.dao.impl;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbExcepption;
import model.dao.PassageiroDao;
import model.entities.Passageiro;

public class PassageiroDaoJDBC implements PassageiroDao{
	Connection conn;
	public PassageiroDaoJDBC() {
		this.conn = conn;
	}

	@Override
	public void insert(Passageiro obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("insert into passageiro (nm_passag,cpf,pas_nascio,pass_passaporte,dt_nasc) "
					+ "values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getNomePassageiro());
			st.setString(2, obj.getCpf());
			st.setInt(3, obj.getNacionalidade());
			st.setInt(4, obj.getPassaporte());
			st.setDate(5,new java.sql.Date(obj.getDataNascimento().getTime()));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void update(Passageiro obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Passageiro id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Passageiro findById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passageiro> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passageiro achar(String x1) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("select a1.id_pass,a1.nm_passag,a1.dt_nasc,a1.cpf,a2.nu_passaport,a3.nm_pais,a4.nm_visto\r\n" + 
					"from passageiro as a1\r\n" + 
					"join passaporte as a2\r\n" + 
					"on a1.pass_passaporte = a2.id_passaport\r\n" + 
					"join pais as a3\r\n" + 
					"on a1.pas_nascio = a3.id_pais\r\n" + 
					"join visto as a4\r\n" + 
					"on a1.pas_visto = a4.id_visto" + 
					"where a1.nm_passag LIKE '?%'");
			st.setString(1, x1);
			
			rs = st.executeQuery();
			
			while (rs.next()) {	
				System.out.println(
					"Numero: "+rs.getInt("id_pass")+"||"+
					"Nome: "+rs.getString("nm_passag")+"||"+
					"Data Nascimento: "+rs.getDate("dt_nasc")+"||"+
					"CPF: "+rs.getString("cpf")+"||"+
					"Passaporte: "+rs.getString("nu_passaport")+"||"+
					"Nacionalidade: "+rs.getString("nm_pais")+"||"+
					"Visto: "+rs.getFloat("nm_visto")+"||"+"\n"
					);
				}
		} catch (SQLException e1) {
			throw new DbExcepption(e1.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		return null;
	}

	@Override
	public void achar() {
		// TODO Auto-generated method stub
		
	}

}
