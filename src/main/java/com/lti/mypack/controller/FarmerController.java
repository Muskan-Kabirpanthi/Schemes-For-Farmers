package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.farmerreg.Farmer;
import com.lti.mypack.farmerreg.Land;
import com.lti.mypack.service.FarmerService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/farmer/api")
public class FarmerController {
	
	@Autowired
	FarmerService farmser;
	
	@GetMapping("/getfarmers")
	public List<Farmer> getAll(){
		return farmser.getFarmer();
	}
	
	
	@PostMapping("/getfarmers")
	public boolean addFarmer(@RequestBody Farmer farmer) throws Exception {
		String tempEmail=farmer.getEmail();
		if(tempEmail!=null &&  !"".equals(tempEmail))  {
			Farmer farmerObj=farmser.fetchUserByEmail(tempEmail);
			if(farmerObj!=null) {
				throw new Exception("Farmer with "+tempEmail+" already exist");
			}
		}
		
		return farmser.addFarmer(farmer);
	}
	
	@PostMapping("/login")
	public Farmer farmerLogin(@RequestBody Farmer farmer) throws Exception {
		String tempEmail=farmer.getEmail();
		String temppass=farmer.getPassword();
		Farmer farmerObj=null;
		
		if(tempEmail!=null && temppass !=null) {
			farmerObj=farmser.fetchUserByEmailAndPassword(tempEmail, temppass);
	
		}
		if(farmerObj==null) {
			throw new Exception("Invalid EmailId or Password");
		}
		return farmerObj;
	}
	

	
	
	
}


