package com.lti.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location {
		@Id
		private int location_id;
		private String address;
		private String City;
		private String State;
		private int pincode;
		public Location() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Location(int location_id, String address, String city, String state, int pincode) {
			super();
			this.location_id = location_id;
			this.address = address;
			City = city;
			State = state;
			this.pincode = pincode;
		}
		public int getLocation_id() {
			return location_id;
		}
		public void setLocation_id(int location_id) {
			this.location_id = location_id;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
}
