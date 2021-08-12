package com.lti.insurance.controller;

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

import com.lti.insurance.model.Insurance;
import com.lti.insurance.model.Policy;
import com.lti.insurance.service.InsuranceService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/insuranceRest/api")
public class InsuranceController {

	@Autowired
	InsuranceService insuranceService;
	
	@GetMapping("/insurances")
	public List<Insurance> getInsurances()
	{
		return insuranceService.getInsurances();
	}
	@PostMapping("/insurances")
	public boolean addInsurance(@RequestBody Insurance insurance)
	{
		return insuranceService.addInsurance(insurance);
	}
	@PutMapping("/insurances")
	public boolean updateInsurance(@RequestBody Insurance insurance)
	{
		return insuranceService.updateInsurance(insurance);
	}
	@DeleteMapping("/insurances")
	public boolean deleteInsurance(@RequestBody Insurance insurance)
	{
		return insuranceService.deleteInsurance(insurance);
	}
	@GetMapping("/insurancebycroptype/{croptype}")
	public List<Insurance> findInsurancesByCropType(@PathVariable(value="croptype") String cropType)
	{
		return insuranceService.findInsuranceByCropType(cropType);
	}
}
