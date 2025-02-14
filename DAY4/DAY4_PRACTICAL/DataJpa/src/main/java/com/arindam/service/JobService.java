package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Job;
import com.arindam.repository.JobRepository;

@Service
public class JobService {
	@Autowired
private JobRepository jrepo;
	public void addData(Job job)
	{
		jrepo.save(job);//create the table and store the data
	}
	public List<Job> getData()
	{
		return jrepo.findAll();
	}
	public Job getJidDetails(String jid)
	{
		return jrepo.findById(jid).orElse(null);
	}
	public void deleteData(String jid)
	{
		Job j=jrepo.findById(jid).orElse(null);
		if(j!=null)
		{
		   jrepo.delete(j);
		}
	}
	public Job updateData(String jid)
	{
		Job j=jrepo.findById(jid).orElse(null);
		if(j!=null)
		{
			j.setJobnm("NODE JS DEVELOPER");
			j.setYrexp(5);
			j.setCompanynm("CTS");
			jrepo.save(j);
		}
		return j;
	}
}
