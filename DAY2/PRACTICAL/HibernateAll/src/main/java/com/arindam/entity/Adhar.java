package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@Column(length = 10)
private String adharno;
	@Column(length = 25)
private String city;
public Adhar() {
	super();
	// TODO Auto-generated constructor stub
}
public Adhar(String adharno, String city) {
	super();
	this.adharno = adharno;
	this.city = city;
}
public String getAdharno() {
	return adharno;
}
public void setAdharno(String adharno) {
	this.adharno = adharno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Adhar [adharno=" + adharno + ", city=" + city + "]";
}

}
