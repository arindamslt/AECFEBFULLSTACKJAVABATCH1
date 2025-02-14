package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
	@Id
	@Column(length = 10)
private String jobid;
	@Column(length = 25,nullable = false)
private String jobnm;
private Integer yrexp;
@Column(length = 25,nullable = false)
private String companynm;
public Job() {
	super();
	// TODO Auto-generated constructor stub
}
public Job(String jobid, String jobnm, Integer yrexp, String companynm) {
	super();
	this.jobid = jobid;
	this.jobnm = jobnm;
	this.yrexp = yrexp;
	this.companynm = companynm;
}
public String getJobid() {
	return jobid;
}
public void setJobid(String jobid) {
	this.jobid = jobid;
}
public String getJobnm() {
	return jobnm;
}
public void setJobnm(String jobnm) {
	this.jobnm = jobnm;
}
public Integer getYrexp() {
	return yrexp;
}
public void setYrexp(Integer yrexp) {
	this.yrexp = yrexp;
}
public String getCompanynm() {
	return companynm;
}
public void setCompanynm(String companynm) {
	this.companynm = companynm;
}
@Override
public String toString() {
	return "Job [jobid=" + jobid + ", jobnm=" + jobnm + ", yrexp=" + yrexp + ", companynm=" + companynm + "]";
}

}
