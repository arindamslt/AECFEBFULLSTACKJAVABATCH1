package com.arindam.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope("singleton")
public class Project {
private String projectid;
private String projectname;
private Integer duration;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(String projectid, String projectname, Integer duration) {
	super();
	this.projectid = projectid;
	this.projectname = projectname;
	this.duration = duration;
}
public String getProjectid() {
	return projectid;
}
public void setProjectid(String projectid) {
	this.projectid = projectid;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
}
public Integer getDuration() {
	return duration;
}
public void setDuration(Integer duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Project [projectid=" + projectid + ", projectname=" + projectname + ", duration=" + duration + "]";
}

}
