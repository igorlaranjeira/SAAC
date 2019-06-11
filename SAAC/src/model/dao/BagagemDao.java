package model.dao;

import java.util.List;

import model.entities.Bagagem;

public interface BagagemDao {
	void insert(Bagagem obj);
	void update (Bagagem obj);
	void deleteById(Bagagem id);
	Bagagem findById(Integer Id);
	List<Bagagem> findAll();
}
