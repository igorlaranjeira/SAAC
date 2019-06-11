package model.dao;

import db.DB;
import model.dao.impl.AeronaveDaoJDBC;
import model.dao.impl.AeroportoDaoJDBC;
import model.dao.impl.BagagemDaoJDBC;
import model.dao.impl.ComissarioDaoJDBC;
import model.dao.impl.CompaniaDaoJDBC;
import model.dao.impl.LogDaoJDBC;
import model.dao.impl.LoginDaoJDBC;
import model.dao.impl.NacionalidadeDaoJDBC;
import model.dao.impl.PaisDaoJDBC;
import model.dao.impl.PassageiroDaoJDBC;
import model.dao.impl.PassaporteDaoJDBC;
import model.dao.impl.PilotoDaoJDBC;
import model.dao.impl.VistoDaoJDBC;

public class DaoFactory {
	public static AeronaveDao createAeronaveDao() {
		return new AeronaveDaoJDBC(DB.getConnection());
	}
	
	public static AeroportoDao createAeroportoDao() {
		return new AeroportoDaoJDBC(DB.getConnection());
	}
	
	public static BagagemDao createBagagemDao() {
		return new BagagemDaoJDBC(DB.getConnection());
	}
	
	public static ComissarioDao createComissarioDao() {
		return new ComissarioDaoJDBC();
	}
	
	public static CompaniaDao createCompaniaDao() {
		return new CompaniaDaoJDBC();
	}
	
	public static LogDao createLogDao() {
		return new LogDaoJDBC();
	}
	
	public static LoginDao createLoginDao() {
		return new LoginDaoJDBC();
	}
	
	public static NacionalidadeDao createNacionalidadeDao() {
		return new NacionalidadeDaoJDBC();
	}
	
	public static PaisDao createPaisDao() {
		return new PaisDaoJDBC();
	}
	
	public static PassageiroDao createPassageiroDao() {
		return new PassageiroDaoJDBC();
	}
	
	public static PassaporteDao createPassaporteDao() {
		return new PassaporteDaoJDBC();
	}
	
	public static PilotoDao createPilotoDao() {
		return new PilotoDaoJDBC();
	}
	
	public static VistoDao createVistoDao() {
		return new VistoDaoJDBC();
	}
	
}
