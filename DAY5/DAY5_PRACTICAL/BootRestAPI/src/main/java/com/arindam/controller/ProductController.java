package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Product;
import com.arindam.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
private ProductService pservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Product p)
	{
		String msg="DATA INSERTED SUCCESSFULLY";
		pservice.addData(p);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Product>> getData()
	{
		List<Product> plist=pservice.getData();
		return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
	}
	@GetMapping("/fetch/{pid}")
	public ResponseEntity<Product> getPidDetails(@PathVariable String pid)
	{
		Product ps=pservice.getPidDetails(pid);
		return new ResponseEntity<Product>(ps,HttpStatus.OK);
	}
	@DeleteMapping("/del/{pid}")
	public ResponseEntity<String> deleteData(@PathVariable String pid)
	{
		String msg="DATA DELETED SUCCESSFULLY";
		pservice.deleteData(pid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@PutMapping("/upd/{pid}")
	public ResponseEntity<Product> updateData(@PathVariable String pid,@RequestBody Product ps)
	{
		Product pst=pservice.updateData(pid, ps);
		return new ResponseEntity<Product>(pst,HttpStatus.OK);
	}
	
}
