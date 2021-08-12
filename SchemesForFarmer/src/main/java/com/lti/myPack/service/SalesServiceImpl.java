package com.lti.myPack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myPack.model.Sales;
import com.lti.myPack.repository.SalesRepository;

@Service
@Transactional
public class SalesServiceImpl implements SalesService {

	@Autowired
	SalesRepository salesRepo;
	

	@Override
	public List<Sales> getProducts() {
		return salesRepo.findAll();
	}

	@Override
	public boolean addProduct(Sales sales) {
		salesRepo.save(sales);
		
		return true;
	}

	@Override
	public boolean updateProduct(Sales sales) {
		Sales newp = salesRepo.findById(sales.getProdId()).get();
		newp=sales;
		salesRepo.save(newp);
		return true;
	}

	@Override
	public boolean deleteProduct(Sales product) {
		salesRepo.delete(product);
		return true;
	}

	@Override
	public Sales findProduct(int salesid) {
		return salesRepo.findById(salesid).get();
	}

	
	

	
	

}
