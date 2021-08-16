package com.lti.product.service;


import java.util.List;

import com.lti.product.model.AddProduct;

import com.lti.product.model.Bidder;
import com.lti.product.model.Bidding;
import com.lti.product.model.MarketPlace;


public interface ProductService {
	public List<AddProduct> getProducts();
	
	public boolean addingProduct(AddProduct addproduct);
	
	public List<Bidder> getBidders();
	
	public boolean addingBidders(Bidder bidders);

	//public String updateProduct(AddProduct product);

	boolean addingBidder(Bidding bidding);

	public List<Bidding> getBidding();

	public boolean addMarket(MarketPlace market);

	public List<MarketPlace> getMarket();
	
//	public List<Bidding> findByfarmer_id(int id);
	
	
	
}
