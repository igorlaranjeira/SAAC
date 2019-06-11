package model.dao;

import java.util.List;

import model.entities.Piloto;


public interface PilotoDao {
	void insert(Piloto obj);
	void update (Piloto obj);
	void deleteById(Piloto id);
	Piloto findById(Integer Id);
	List<Piloto> findAll();
}
