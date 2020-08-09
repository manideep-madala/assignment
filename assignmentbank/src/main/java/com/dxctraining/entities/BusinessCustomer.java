package com.dxctraining.bankingapp.entities;

public class BusinessCustomer extends Customer {
	private String businessAddress;

	public BusinessCustomer(String businessAddress,int id,String name,double balance,Account account){
		super(id,name,balance,account);
		this.businessAddress=businessAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;

	}
}
