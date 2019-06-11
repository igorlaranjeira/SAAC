package model.dao;

import java.util.List;

import model.entities.Pais;

public interface PaisDao {
	void insert(Pais obj);
	void update (Pais obj);
	void deleteById(Pais id);
	Pais findById(Integer Id);
	List<Pais> findAll();
}
