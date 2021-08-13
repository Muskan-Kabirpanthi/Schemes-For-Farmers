package com.lti.myPack.service;

import java.util.List;

import com.lti.myPack.model.Insurance;

public interface InsuranceService {
	public List<Insurance> getInsurances();

	public boolean addInsurance(Insurance insurance);

	public boolean updateInsurance(Insurance insurance);

	public boolean deleteInsurance(Insurance insurance);

	public List<Insurance> findInsuranceByCropType(String cropType);
}
