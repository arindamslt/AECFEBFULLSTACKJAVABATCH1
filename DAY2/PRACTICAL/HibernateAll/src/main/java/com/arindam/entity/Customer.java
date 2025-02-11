package com.arindam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
private String cid;
private String cname;
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
