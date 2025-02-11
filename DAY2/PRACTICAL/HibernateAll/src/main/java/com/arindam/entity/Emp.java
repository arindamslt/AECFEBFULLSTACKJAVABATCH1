package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	@Column(length = 10)
private String eid;
	@Column(length = 25)
private String ename;
	@OneToOne
	@JoinColumn(name="Adhar_no")
private Adhar adhar;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String eid, String ename, Adhar adhar) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.adhar = adhar;
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
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", adhar=" + adhar + "]";
	}

}
