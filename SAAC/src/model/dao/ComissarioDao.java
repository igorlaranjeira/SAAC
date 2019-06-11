package model.dao;

import java.util.List;

import model.entities.Comissario;

public interface ComissarioDao {
	void insert(Comissario obj);
	void update (Comissario obj);
	void deleteById(Comissario id);
	Comissario findById(Integer Id);
	List<Comissario> findAll();
}
