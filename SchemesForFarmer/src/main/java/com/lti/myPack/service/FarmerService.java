package com.lti.myPack.service;

import java.util.List;

import com.lti.myPack.model.Farmer;
import com.lti.myPack.model.Land;

public interface FarmerService {
	public List<Farmer> getFarmer();
	public boolean addFarmer(Farmer farmer);
	
	
	public List<Land> getLand();
	public boolean addLand(Land land);

}
