package com.lti.myPackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.myPackage.model.Claim;
import com.lti.myPackage.model.Sales;
import com.lti.myPackage.service.ClaimService;
import com.lti.myPackage.service.SalesService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/productRest/api")
public class SalesController {
	
	@Autowired
	SalesService prodSale;
	
	@Autowired
	ClaimService claimApproved;
	
	@GetMapping("/Sales")
	public List<Sales> getAll(){
		
		return prodSale.getProducts();
	}
	
	@GetMapping("/Claims")
	public List<Claim> getAllClaims(){
		
		return claimApproved.getClaims();
	}
	
	@GetMapping("/Sales/{Sales_id}")
	public Sales getProductById(@PathVariable (value="sales_id")int salesid) {
		return prodSale.findProduct(salesid);
		
	}
	
	@PutMapping("/Sales")
	public boolean updateProduct(@RequestBody Sales sales) {
		return prodSale.updateProduct(sales);
	}
	
	@PutMapping("/Claims")
	public boolean updateClaim(@RequestBody Claim claim) {
		return claimApproved.updateClaim(claim);
	}
	
	@DeleteMapping("/Sales")
	public boolean deleteProduct(@RequestBody Sales sales) {
		return prodSale.deleteProduct(sales);
	}
	
	
	@PostMapping("/Sales")
	public boolean addProduct(@RequestBody Sales product)
	{
		return prodSale.addProduct(product);
	}
	@PostMapping("/Claims")
	public boolean addClaim(@RequestBody Claim claim)
	{
		return claimApproved.addClaim(claim);
	}

}
