package model.dao;

import java.util.List;

import model.entities.Compania;

public interface CompaniaDao {
	void insert(Compania obj);
	void update (Compania obj);
	void deleteById(Compania id);
	Compania findById(Integer Id);
	List<Compania> findAll();
}
