package model.dao;

import java.util.List;

import model.entities.Visto;

public interface VistoDao {
	void insert(Visto obj);
	void update (Visto obj);
	void deleteById(Visto id);
	Visto findById(Integer Id);
	List<Visto> findAll();
}
