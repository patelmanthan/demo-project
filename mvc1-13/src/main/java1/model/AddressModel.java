package model;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class AddressModel {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(AddressModel.class.getName());

	private String address;
	private String city;
	private String state;
	private String country;
	private int address_id;
	private int user_id;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
