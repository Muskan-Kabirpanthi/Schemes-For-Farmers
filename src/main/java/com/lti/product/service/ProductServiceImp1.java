package com.lti.product.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.product.model.AddProduct;

import com.lti.product.model.Bidder;
import com.lti.product.model.Bidding;
import com.lti.product.model.MarketPlace;
import com.lti.product.repository.BidderRepository;
import com.lti.product.repository.BiddingRepository;
import com.lti.product.repository.MarketReposotiry;
import com.lti.product.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImp1 implements ProductService {
	
	
	@Autowired
	ProductRepository prodRepo;
	@Autowired
	BidderRepository bidderRepo;
	@Autowired 
	BiddingRepository biddingRepo;
	@Autowired
	MarketReposotiry marketRepo;
	
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
	public boolean addingBidder(Bidding bidding) {
	AddProduct product= prodRepo.findById(bidding.getProduct_id()).get();
	product.setBidding(bidding);
	List<AddProduct> prodList = new ArrayList<AddProduct>();
	prodList.add(product);
	bidding.setProducts(prodList);
	prodRepo.save(product);
	biddingRepo.save(bidding);
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
	public List<Bidding> getBidding() {
		
		return biddingRepo.findAll();
	}
//	@Override
//	public List<Bidding> findByfarmer_id(int id) {
//		
//		return biddingRepo.findByfarmer_idList(id);
//	}
//	
//	@Override
//	public String updateProduct(AddProduct product) {
//		AddProduct prd = prodRepo.getById(product.getProduct_id());
//		if(prd.getBidder_amount()<product.getBidder_amount()) 
//		{
//			prodRepo.save(product);
//			return "Updated";
//		}
//		else
//			return "Not Updated";
//	
//	
//	}
	@Override
	public boolean addMarket(MarketPlace market) {
		marketRepo.save(market);
		return true;
	}
	@Override
	public List<MarketPlace> getMarket() {
		// TODO Auto-generated method stub
		return marketRepo.findAll();
	}
	
	

}
	
	
	
	 
	
	
	

