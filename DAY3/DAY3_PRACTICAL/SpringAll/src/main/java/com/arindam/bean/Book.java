package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="bk")
public class Book {
	@Value("B1")
private String bid;
	@Value("CORE JAVA")
private String bname;
	@Value("700.00")
private Double price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String bid, String bname, Double price) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.price = price;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
}

}
