package com.arindam.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp")
public class DbConn {
private String driver;
private String url;
private String username;
private String password;
public DbConn() {
	super();
	// TODO Auto-generated constructor stub
}
public DbConn(String driver, String url, String username, String password) {
	super();
	this.driver = driver;
	this.url = url;
	this.username = username;
	this.password = password;
}
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "DbConn [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password + "]";
}

}
