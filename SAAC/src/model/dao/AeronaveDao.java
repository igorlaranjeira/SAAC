package model.dao;

import java.util.List;

import model.entities.Aeronave;
import model.entities.Aeroporto;

public interface AeronaveDao {
	void insert(Aeronave obj);
	void update (Aeronave obj);
	void deleteById(Aeronave id);
	Aeronave findById(Integer Id);
	List<Aeronave> findAll();
	

}
