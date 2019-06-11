package model.dao;

import java.util.List;

import model.entities.Passaporte;

public interface PassaporteDao {
	void insert(Passaporte obj);
	void update (Passaporte obj);
	void deleteById(Passaporte id);
	Passaporte findById(Integer Id);
	List<Passaporte> findAll();
}
