package com.lti.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.product.model.AddProduct;
import com.lti.product.model.Bidder;
import com.lti.product.model.Bidding;
import com.lti.product.model.MarketPlace;
import com.lti.product.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/productRest/api")
public class ProductController 
{		
		
		@Autowired
		ProductService prodService;
	
	
		@GetMapping("/products")
		public List<AddProduct> getAll()
		{
			return prodService.getProducts();
			
		}
		
		@PostMapping("/products")
		public boolean addingProduct(@RequestBody AddProduct addproduct)
		{
			
			
			return prodService.addingProduct(addproduct);
		
		}
		
		@GetMapping("/bidding")
		public List<Bidding> getAllBidding()
		{
			return prodService.getBidding();
			
		}
		@GetMapping("/market")
		public List<MarketPlace> getAllMarket()
		{
			return prodService.getMarket();
			
		}
		
		
		@PostMapping("/market")
		public boolean addAllMarket(@RequestBody MarketPlace market)
		{
			prodService.addMarket(market);
			return true;
			
		}
		
		@PostMapping("/bidding")
		public boolean addingBidding(@RequestBody Bidding bidding)
		{
			
			return prodService.addingBidder(bidding);
		
		}
		
//		@PutMapping("/products")
//		public String updateEmployee(@RequestBody AddProduct product){
//			
//			return prodService.updateProduct(product);
//		}
		
		
		
		@GetMapping("/bidders")
		public List<Bidder> getBidders(){
			return prodService.getBidders();
		}
		
		@PostMapping("/bidders")
		public boolean addingBidders(@RequestBody Bidder bidder)
		{
			return prodService.addingBidders(bidder);
		}
		
		
		
}
