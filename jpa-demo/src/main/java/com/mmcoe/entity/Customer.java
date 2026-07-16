package com.mmcoe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table (name="cust")
public class Customer {
	@Id @Column (name="cid")
	private int custId;
	@Column (name="cname",length = 30)
	private String custName;
	private String city; // Does not need to specity because it matches with the column name so that
	
	@OneToMany(mappedBy="cust")
	private List<Order> orders = new ArrayList<Order>();
	
	public Customer() {

	}
	
	public Customer(int custId, String custName, String city) {
		this.custId = custId;
		this.custName = custName;
		this.city = city;
	}
	
	//Getters and Setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + "]";
	}
	
	
}
