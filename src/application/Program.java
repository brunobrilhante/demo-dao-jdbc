package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//Dessa forma o programa não conhece a implementação, somente a interface
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findbyId ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
