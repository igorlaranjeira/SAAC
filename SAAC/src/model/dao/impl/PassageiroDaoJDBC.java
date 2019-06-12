package model.dao.impl;

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
		// TODO Auto-generated method stub
		
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
	public void achar() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("select *\r\n" + 
					"from aeronave as a1 \r\n" + 
					"inner join aeronave_pesos as a2\r\n" + 
					"on a1.id_aero = a2.id_aero2\r\n" + 
					"join compania as a3\r\n" + 
					"on a1.comp_aero = a3.id_compa ");
			
			rs = st.executeQuery();
			
			while (rs.next()) {	
				System.out.println(
					"Numero: "+rs.getInt("id_aero")+"||"+
					"Modelo: "+rs.getString("mod_aero")+"||"+
					"Envergadura: "+rs.getFloat("env_aero")+"||"+
					"comprimento: "+rs.getFloat("con_aero")+"||"+
					"Base: "+rs.getFloat("bas_aero")+"||"+
					"Motor: "+rs.getInt("moto_aero")+"||"+
					"Carga Paga: "+rs.getFloat("pax_aero")+"||"+
					"Compania: "+rs.getString("nm_compa")+"||"+
					"Peso Medio Decolagem: "+rs.getFloat("pmd_aero")+"||"+
					"Peso Medio Aterrissagem: "+rs.getFloat("pma_aero")+"||"+
					"Peso operacional vazio: "+rs.getFloat("pov_aero")+"||"+
					"Peso sem combustivel: "+rs.getFloat("pzc_aero")+"||"+
					"Comprimento B/ Pista: "+rs.getFloat("cbp_aero")+"\n"
					);
				}
		} catch (SQLException e1) {
			throw new DbExcepption(e1.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
