package com.lti.myPack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.myPack.model.Farmer;
import com.lti.myPack.model.Land;
import com.lti.myPack.service.FarmerService;



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
	
	@GetMapping("/getlands")
	public List<Land> getAllLand(){
		return farmser.getLand();
	}
	
	@PostMapping("/getfarmers")
	public boolean addFarmer(@RequestBody Farmer farmer) {
		return farmser.addFarmer(farmer);
	}
	
	@PostMapping("/getlands")
	public boolean addLand(@RequestBody Land land) {
		return farmser.addLand(land);
	
	}

}
