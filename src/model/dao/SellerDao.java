package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void isert(Seller obj);
	void updafe(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	
}
