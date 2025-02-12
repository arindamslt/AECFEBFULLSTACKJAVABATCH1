package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="emp")
public class Employee {
	@Value("${eid}")
private String eid;
	@Value("${ename}")
private String ename;
	@Value("${friends}")
private List<String> friends;
	@Value("${phno}")
private  Set<String> phno;
	@Value("#{${products}}")
private Map<String,Double> products;
	@Value("#{${pinfo}}")
private Properties pinfo;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String eid, String ename, List<String> friends, Set<String> phno, Map<String, Double> products,
		Properties pinfo) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.friends = friends;
	this.phno = phno;
	this.products = products;
	this.pinfo = pinfo;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public List<String> getFriends() {
	return friends;
}
public void setFriends(List<String> friends) {
	this.friends = friends;
}
public Set<String> getPhno() {
	return phno;
}
public void setPhno(Set<String> phno) {
	this.phno = phno;
}
public Map<String, Double> getProducts() {
	return products;
}
public void setProducts(Map<String, Double> products) {
	this.products = products;
}
public Properties getPinfo() {
	return pinfo;
}
public void setPinfo(Properties pinfo) {
	this.pinfo = pinfo;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", friends=" + friends + ", phno=" + phno + ", products="
			+ products + ", pinfo=" + pinfo + "]";
}

}
