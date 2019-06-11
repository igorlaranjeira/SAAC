package model.dao;

import java.util.List;
import model.entities.Login;

public interface LoginDao {
	void insert(Login obj);
	void update (Login obj);
	void deleteById(Login id);
	Login findById(Integer Id);
	List<Login> findAll();
}
