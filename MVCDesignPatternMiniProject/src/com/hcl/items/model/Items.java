package com.hcl.items.model;

public class Items {

	private int itemCode;
	private String itemname;
	private int itemQuantity;
	private double itemPrice;
	
	public Items(int itemCode, String itemname, int itemQuantity, double itemPrice) throws IllegalArgumentException{
		super();
		if(itemCode<0)
		{
			throw new IllegalArgumentException("exception occured, id cannot less than zero");
		}
		this.itemCode = itemCode;
		
		if(itemname==null) {
			throw new IllegalArgumentException("exception occured, name cannot be null");
	
		}
		this.itemname = itemname;
		
		if(itemQuantity<0)
		{
			throw new IllegalArgumentException("exception occured, quantity cannot less than zero");
		}
		
		this.itemQuantity = itemQuantity;
		
		if(itemPrice<0)
		{
			throw new IllegalArgumentException("exception occured, price cannot less than zero");
		}
		this.itemPrice = itemPrice;
	}
	
	public int getItemID() {
		return itemCode;
	}
	
	public void setItemID(int itemID) {
		this.itemCode = itemID;
	}
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	public String toString() {
		return "" + itemCode + " " + itemname + " " + itemQuantity + " "+ itemPrice  ;
	}


}

