package com.lti.product.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.product.model.AddProduct;
import com.lti.product.model.Bidder;
import com.lti.product.model.Location;
import com.lti.product.repository.BidderRepository;
import com.lti.product.repository.LocationRepository;
import com.lti.product.repository.ProductRepository;

@Service
@Transactional

public class ProductServiceImp1 implements ProductService {
	
	
	@Autowired
	ProductRepository prodRepo;
	@Autowired
	BidderRepository bidderRepo;
	@Autowired
	LocationRepository locationRepo;
	
	
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
	public List<Location> getLocations() {
		
		return locationRepo.findAll();
	}
	@Override
	public boolean addingLocation(Location location) {
		locationRepo.save(location);
		return false;
	}
	
	 
	
	
	
}
