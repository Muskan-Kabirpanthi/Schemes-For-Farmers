package com.lti.myPack.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myPack.model.AddProduct;
import com.lti.myPack.model.Bidder;
import com.lti.myPack.model.Location;
import com.lti.myPack.repository.BidderRepository;
import com.lti.myPack.repository.LocationRepository;
import com.lti.myPack.repository.ProductRepository;


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
