package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "/")
public class Sales {
private String salesid;
private List<String> cname;
private Set<String> email;
private Map<String,Double> purchase;
private Properties address;
public Sales() {
	super();
	// TODO Auto-generated constructor stub
}
public Sales(String salesid, List<String> cname, Set<String> email, Map<String, Double> purchase, Properties address) {
	super();
	this.salesid = salesid;
	this.cname = cname;
	this.email = email;
	this.purchase = purchase;
	this.address = address;
}
public String getSalesid() {
	return salesid;
}
public void setSalesid(String salesid) {
	this.salesid = salesid;
}
public List<String> getCname() {
	return cname;
}
public void setCname(List<String> cname) {
	this.cname = cname;
}
public Set<String> getEmail() {
	return email;
}
public void setEmail(Set<String> email) {
	this.email = email;
}
public Map<String, Double> getPurchase() {
	return purchase;
}
public void setPurchase(Map<String, Double> purchase) {
	this.purchase = purchase;
}
public Properties getAddress() {
	return address;
}
public void setAddress(Properties address) {
	this.address = address;
}
@Override
public String toString() {
	return "Sales [salesid=" + salesid + ", cname=" + cname + ", email=" + email + ", purchase=" + purchase
			+ ", address=" + address + "]";
}

}
