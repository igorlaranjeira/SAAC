package model.dao;

import java.util.List;

import model.entities.Passageiro;

public interface PassageiroDao {
	void insert(Passageiro obj);
	void update (Passageiro obj);
	void deleteById(Passageiro id);
	Passageiro findById(Integer Id);
	List<Passageiro> findAll();
	void achar();
	void achar(String x1);
}
