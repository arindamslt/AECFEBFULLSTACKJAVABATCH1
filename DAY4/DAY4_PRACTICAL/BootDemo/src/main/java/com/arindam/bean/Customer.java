package com.arindam.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("C1")
private String cid;
	@Value("ANUP")
private String cname;
	@Value("3545454")
private String cpho;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cid, String cname, String cpho) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpho = cpho;
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
	public String getCpho() {
		return cpho;
	}
	public void setCpho(String cpho) {
		this.cpho = cpho;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cpho=" + cpho + "]";
	}
	
}
