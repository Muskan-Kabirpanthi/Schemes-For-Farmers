package com.lti.myPack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myPack.model.Farmer;
import com.lti.myPack.repository.FarmerRepo;

@Service
@Transactional
public class FarmerServiceImp implements FarmerService {

	@Autowired
	FarmerRepo farmerrepo;

	@Override
	public List<Farmer> getFarmer() {
		return farmerrepo.findAll();
	}

	@Override
	public boolean addFarmer(Farmer farmer) {
		farmerrepo.save(farmer);
		return true;
	}

	@Override
	public Farmer fetchUserByEmail(String email) {
		return farmerrepo.findByEmail(email);

	}

	@Override
	public Farmer fetchUserByEmailAndPassword(String email, String password) {
		return farmerrepo.findByEmailAndPassword(email, password);
	}

}