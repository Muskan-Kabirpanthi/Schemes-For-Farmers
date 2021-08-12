package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.farmerreg.Farmer;
import com.lti.mypack.farmerreg.Land;
import com.lti.mypack.repository.FarmerRepo;
import com.lti.mypack.repository.LandRepo;

@Service
@Transactional
public class FarmerServiceImp implements FarmerService {


	@Autowired
	FarmerRepo farmerrepo;
	
	@Autowired
	LandRepo landrepo;
	
	
	@Override
	public List<Farmer> getFarmer() {
		return farmerrepo.findAll();
	}

	@Override
	public boolean addFarmer(Farmer farmer) {
		farmerrepo.save(farmer);
		return true;
	}
	
	//
	
	@Override
	public List<Land> getLand() {
		return landrepo.findAll();
	}

	@Override
	public boolean addLand(Land land) {
		landrepo.save(land);
		return true;
	}
	

}
