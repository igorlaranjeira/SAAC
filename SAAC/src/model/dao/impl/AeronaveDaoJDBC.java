package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
			if (rs.next()) {
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
				
				
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Aeronave> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
