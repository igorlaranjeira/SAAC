package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbExcepption;
import model.dao.AeronaveDao;
import model.entities.Aeronave;

public class AeronaveDaoJDBC implements AeronaveDao{

	private Connection conn;
	
	public AeronaveDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Aeronave obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Aeronave obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Aeronave id) {
		// TODO Auto-generated method stub
		
	}
//testando essa merda aqui....
	@Override
	public Aeronave findById(Integer Id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("select * from aeronave as a1 inner join aeronave_pesos as a2\r\n" + 
					"on a1.id_aero = a2.id_aero2\r\n" + 
					"where a1.id_aero = ?\r\n" + 
					"");
			st.setInt(1, Id);
			rs = st.executeQuery();
			
			
			Map<Integer, Aeronave> map = new HashMap<>();
			while (rs.next()) {
				Aeronave ae = map.get(rs.getInt("id_aero"));
				
				if(ae == null) {
					Aeronave aero = new Aeronave();
					aero.setIdAeronave(rs.getInt("id_aero"));
					aero.setModAeronave(rs.getString("mod_aero"));
					aero.setEnvAeronave(rs.getFloat("env_aero"));
					aero.setConAeronave(rs.getFloat("con_aero"));
					aero.setBasAeronave(rs.getFloat("bas_aero"));
					aero.setMotoAeronave(rs.getInt("moto_aero"));
					aero.setPaxAeronave(rs.getFloat("pax_aero"));
					aero.setCompaniaAero(rs.getInt("comp_aero"));
					aero.setPmaAeronave(rs.getFloat("pmd_aero"));
					aero.setPmaAeronave(rs.getFloat("pma_aero"));
					aero.setPovAeronave(rs.getFloat("pov_aero"));
					aero.setPzcAeronave(rs.getFloat("pzc_aero"));
					aero.setCbpAeronave(rs.getFloat("cbp_aero"));
					return aero;
				}
			}
		} catch (SQLException e) {
			throw new DbExcepption(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		return null;
	}
	
	
	@Override
	public List<Aeronave> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findTudo() {
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
