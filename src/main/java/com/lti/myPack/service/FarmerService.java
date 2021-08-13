package com.lti.myPack.service;

import java.util.List;

import com.lti.myPack.model.Farmer;

public interface FarmerService {
	public List<Farmer> getFarmer();

	public boolean addFarmer(Farmer farmer);

	public Farmer fetchUserByEmail(String email);

	public Farmer fetchUserByEmailAndPassword(String email, String password);

}