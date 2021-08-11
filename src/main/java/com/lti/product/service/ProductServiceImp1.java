package com.lti.product.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.product.model.AddProduct;
import com.lti.product.repository.ProductRepository;

@Service
@Transactional

public class ProductServiceImp1 implements ProductService {
	
	
	@Autowired
	ProductRepository prodRepo;

	@Override
	public List<AddProduct> getProducts() {
		return prodRepo.findAll();
		
	}
	@Override
	public boolean addingProduct(AddProduct addproduct) {
		prodRepo.save(addproduct);
		return true;
	}
	
	 
	
	
	
}