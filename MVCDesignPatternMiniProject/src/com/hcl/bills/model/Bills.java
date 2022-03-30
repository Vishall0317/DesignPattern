package com.hcl.bills.model;

import java.util.Date;
import java.util.List;

import com.hcl.Items;

public class Bills {

	private String name;
	private List<Items> items;
	private double cost;
	private Date time;
	
	public Bills() {
	}
	public Bills(String name, List<Items> items, double cost, Date time)  {
		this.name = name;
		this.items = items;
		if(cost<0)
		{
			throw new IllegalArgumentException("exception occured, cost cannot less than zero");
		}
		this.cost = cost;
		this.time = time;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> selectedItems) {
		this.items = selectedItems;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date date) {
		this.time = date;
	}
	

}
