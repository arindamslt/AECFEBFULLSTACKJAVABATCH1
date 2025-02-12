package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="cst")

public class Customer {
	@Value("C1")
private String cid;
	@Value("RAMAN")
private String cname;
	@Value("565665")
private String cphno;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String cid, String cname, String cphno) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cphno = cphno;
}
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCphno() {
	return cphno;
}
public void setCphno(String cphno) {
	this.cphno = cphno;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + "]";
}



}
