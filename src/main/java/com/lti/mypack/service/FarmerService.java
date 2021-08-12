package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.farmerreg.Farmer;
import com.lti.mypack.farmerreg.Land;

public interface FarmerService {
	public List<Farmer> getFarmer();
	public boolean addFarmer(Farmer farmer);
	
	
	public List<Land> getLand();
	public boolean addLand(Land land);

}
