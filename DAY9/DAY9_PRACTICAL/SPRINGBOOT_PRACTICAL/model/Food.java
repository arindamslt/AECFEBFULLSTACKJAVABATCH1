package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {
	@Id
	@Column(length = 10)
private String fid;
	@Column(length = 25,nullable = false)
private String fname;
private Double price;
public Food() {
	super();
	// TODO Auto-generated constructor stub
}
public Food(String fid, String fname, Double price) {
	super();
	this.fid = fid;
	this.fname = fname;
	this.price = price;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Food [fid=" + fid + ", fname=" + fname + ", price=" + price + "]";
}

}
