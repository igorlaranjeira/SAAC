package model.dao;

import java.util.List;

import model.entities.Aeronave;

public interface AeronaveDao {
	void insert(Aeronave obj);
	void update (Aeronave obj);
	void deleteById(Aeronave id);
	Aeronave findById(Integer Id);
	List<Aeronave> findAll();

}
