package com.arindam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="Employee_master")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer eid;
	@Column(length = 25,nullable = false)
private String ename;
	@Column(name="job",length = 25)
private String edesig;
private Double sal;
@Temporal(TemporalType.DATE)
private Date joindt;
@Temporal(TemporalType.TIMESTAMP)
private Date workhr;
@Transient
private String email;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer eid, String ename, String edesig, Double sal, Date joindt, Date workhr, String email) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.edesig = edesig;
	this.sal = sal;
	this.joindt = joindt;
	this.workhr = workhr;
	this.email = email;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdesig() {
	return edesig;
}
public void setEdesig(String edesig) {
	this.edesig = edesig;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public Date getJoindt() {
	return joindt;
}
public void setJoindt(Date joindt) {
	this.joindt = joindt;
}
public Date getWorkhr() {
	return workhr;
}
public void setWorkhr(Date workhr) {
	this.workhr = workhr;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", edesig=" + edesig + ", sal=" + sal + ", joindt=" + joindt
			+ ", workhr=" + workhr + ", email=" + email + "]";
}

}
