package com.hcl.manager;

public class Movies {

	public String moviesType;
	public int getId;
	public String getName;
	public String getYear;
	public String getGeners;
	public Movies(String moviesType, int getId, String getName, String getYear, String getGeners) {
		super();
		this.moviesType=moviesType;
		this.getId=getId;
		this.getName = getName;
		this.getYear = getYear;
		this.getGeners = getGeners;
	}
	public String getMoviesType() {
		return moviesType;
	}
	public void setMoviesType(String moviesType) {
		this.moviesType = moviesType;
	}
	public int getgetId() {
		return getId;
	}
	public void setId(int getId) {
		this.getId = getId;
	}
	public String getGetName() {
		return getName;
	}
	public void setGetName(String getName) {
		this.getName = getName;
	}
	public String getGetYear() {
		return getYear;
	}
	public void setGetYear(String getYear) {
		this.getYear = getYear;
	}
	public String getGetGeners() {
		return getGeners;
	}
	public void setGetGeners(String getGeners) {
		this.getGeners = getGeners;
	}
	public void moviesInfo() {
		System.out.println("id: "+getId+" "+"movieName: "+getName + " year: " + getYear + " geners:" + getGeners);
	}
	
}