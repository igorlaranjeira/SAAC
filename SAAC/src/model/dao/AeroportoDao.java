package model.dao;

import java.util.List;

import model.entities.Aeroporto;

public interface AeroportoDao {
	void insert(Aeroporto obj);
	void update (Aeroporto obj);
	void deleteById(Aeroporto id);
	Aeroporto findById(Integer Id);
	List<Aeroporto> findAll();
	
}
