package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.farmerreg.Farmer;
import com.lti.mypack.farmerreg.Land;

public interface FarmerService {
	public List<Farmer> getFarmer();
	public boolean addFarmer(Farmer farmer);
	
	public Farmer fetchUserByEmail(String email);
	public Farmer fetchUserByEmailAndPassword(String email, String password);

}
