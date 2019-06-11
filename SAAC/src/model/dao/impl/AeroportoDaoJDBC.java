package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbExcepption;
import model.dao.AeroportoDao;
import model.entities.Aeroporto;

public class AeroportoDaoJDBC implements AeroportoDao{

	private Connection conn;
	public AeroportoDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Aeroporto obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Aeroporto obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Aeroporto id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aeroporto findById(Integer Id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM aeroporto where id_aeroport = ?");
			st.setInt(1, Id);
			rs = st.executeQuery();
			if (rs.next()) {
				Aeroporto aero = new Aeroporto();
				aero.setIdAeroporto(rs.getInt("id_aeroport"));
				aero.setNome(rs.getString("nm_aeroport"));
				aero.setTanhoPista(rs.getFloat("tm_pista"));
				aero.setAlturaPista(rs.getFloat("alt_pista"));
				aero.setPais(rs.getInt("aero_pais"));
				return aero;
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
	public List<Aeroporto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
