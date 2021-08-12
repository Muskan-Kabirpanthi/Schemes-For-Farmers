package com.lti.product.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.product.model.AddProduct;
import com.lti.product.model.Bidder;

import com.lti.product.repository.BidderRepository;

import com.lti.product.repository.ProductRepository;

@Service
@Transactional

public class ProductServiceImp1 implements ProductService {
	
	
	@Autowired
	ProductRepository prodRepo;
	@Autowired
	BidderRepository bidderRepo;
	
	
	
	@Override
	public List<AddProduct> getProducts() {
		return prodRepo.findAll();
	}
	@Override
	public boolean addingProduct(AddProduct addproduct) {
		prodRepo.save(addproduct);
		return true;
	}
	
	@Override
	public List<Bidder> getBidders() {
		return bidderRepo.findAll();
		
	}
	@Override
	public boolean addingBidders(Bidder bidders) {
		bidderRepo.save(bidders);
		return true;
	}
	@Override
	public void updateProduct(AddProduct product) {
//		AddProduct existingProduct = prodRepo.getById(product_id);
//		existingProduct.setBidder_amount(product.getBidder_amount());
//		existingProduct.setBidder_id(product.getBidder_id());
		prodRepo.save(product);
		System.out.println("Working");
	}

	
	
	}
	
	 
	
	
	

