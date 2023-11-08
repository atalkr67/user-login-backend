package com.user.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {

	public AddressEntity() {
		super();
	}
	
	public AddressEntity(int addressId, String address) {
		super();
		this.addressId = addressId;
		this.address = address;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@Column(name="ADDRESS")
	private String address;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\"AddressEntity\": {\n\t\"addressId\":" + addressId + ", \n\t\"address\":" + address + "\n}";
	}	
	
}
