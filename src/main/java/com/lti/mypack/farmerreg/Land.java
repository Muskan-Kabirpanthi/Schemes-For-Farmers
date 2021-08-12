package com.lti.mypack.farmerreg;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LandsData")
public class Land {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int landId;
	private int area;
	private int locationId;
	
//	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy = "land")
//	private Farmer farmer;
	
	
	public int getLandId() {
		return landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

//	public Farmer getFarmer() {
//		return farmer;
//	}
//
//	public void setFarmer(Farmer farmer) {
//		this.farmer = farmer;
//	}
	
	public Land() {}

	public Land(int landId, int area, int locationId) {
		super();
		this.landId = landId;
		this.area = area;
		this.locationId = locationId;
		
	}
	 

}
