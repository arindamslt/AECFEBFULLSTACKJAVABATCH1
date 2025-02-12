package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="empl")
public class Emp {
	@Value("${eid}")
private String eid;
	@Value("${ename}")
private String ename;
	@Value("${desig}")
private String desig;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(String eid, String ename, String desig) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.desig = desig;
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
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", desig=" + desig + "]";
}

}
