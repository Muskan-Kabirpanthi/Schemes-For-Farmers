package com.lti.myPack.service;

import java.util.List;

import com.lti.myPack.model.Sales;

public interface SalesService {
	public List<Sales> getProducts();
	public boolean addProduct(Sales sales);
	
	public boolean updateProduct(Sales sales);
	
	public boolean deleteProduct(Sales sales);
	
	public Sales findProduct(int salesid);
	
	//public List<Product> findProductByCategory(String category);
}
