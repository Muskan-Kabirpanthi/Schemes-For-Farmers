package com.lti.myPackage.service;

import java.util.List;

import com.lti.myPackage.model.Sales;

public interface SalesService {
	public List<Sales> getProducts();
	public boolean addProduct(Sales sales);
	
	public boolean updateProduct(Sales sales);
	
	public boolean deleteProduct(Sales sales);
	
	public Sales findProduct(int salesid);
	
	//public List<Product> findProductByCategory(String category);
}
