package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Product;
import com.arindam.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
private ProductRepository prepo;
	public void addData(Product p)
	{
		prepo.save(p);
	}
	public List<Product> getData()
	{
		return prepo.findAll();
	}
	public Product getPidDetails(String pid)
	{
		return prepo.findById(pid).orElse(null);
		
	}
	public void deleteData(String pid)
	{
		Product ps=prepo.findById(pid).orElse(null);
		if(ps!=null)
		{
			prepo.delete(ps);
		}
	}
	public Product updateData(String pid,Product pst)
	{
		Product ps=prepo.findById(pid).orElse(null);
		if(ps!=null)
		{
			ps.setPname(pst.getPname());
			ps.setPqty(pst.getPqty());
			ps.setPrice(pst.getPrice());
			prepo.save(ps);
		}
		return ps;
	}
}
