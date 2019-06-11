package model.dao;

import java.util.List;

import model.entities.Log;

public interface LogDao {
	void insert(Log obj);
	void update (Log obj);
	void deleteById(Log id);
	Log findById(Integer Id);
	List<Log> findAll();
}
