package com.sriman.productServ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriman.model.Product;
import com.sriman.productRepo.ProductRepo;

@Service
public class ProductServ {
	@Autowired
	private ProductRepo repo;
	
	public List<Product> getAll()
	{
		return repo.findAll();
		
	}
	public Product getById(Integer Id)
	{
		return repo.findById(Id).get();
	}
	public Product saveProduct()
	{
		return repo.save(null);
	}

}
