package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbExcepption;
import model.dao.BagagemDao;
import model.entities.Bagagem;

public class BagagemDaoJDBC implements BagagemDao{

	Connection conn;
public BagagemDaoJDBC(Connection conn) {
	this.conn = conn;
}
	@Override
	public void insert(Bagagem obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Bagagem obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Bagagem id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bagagem findById(Integer Id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM bagagem where id_baga = ?");
			st.setInt(1, Id);
			rs = st.executeQuery();
			if (rs.next()) {
				Bagagem baga = new Bagagem();
				baga.setIdenticidaorBagagem(rs.getInt("id_baga"));
				baga.setBagagemMao(rs.getBoolean("baga_mao"));
				baga.setPeso(rs.getFloat("baga_normal"));
				baga.setLocalDespacho(rs.getInt("baga_aeroporto"));
				baga.setNomePassageiro(rs.getInt("baga_passageiro"));
				return baga;
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
	public List<Bagagem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
