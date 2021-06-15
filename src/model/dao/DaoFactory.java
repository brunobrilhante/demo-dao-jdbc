package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	//Método que retorna o tipo da interface mas internamente vai instanciar uma implementação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
