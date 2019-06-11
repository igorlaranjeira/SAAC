package model.dao;

import java.util.List;
import model.entities.Nacionalidade;

public interface NacionalidadeDao {
	void insert(Nacionalidade obj);
	void update (Nacionalidade obj);
	void deleteById(Nacionalidade id);
	Nacionalidade findById(Integer Id);
	List<Nacionalidade> findAll();
}
