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
}
