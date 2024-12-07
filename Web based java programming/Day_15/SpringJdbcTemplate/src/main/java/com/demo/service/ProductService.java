package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addNewProduct();

	List<Product> getAllProducts();

	Product getById(int pid);

	List<Product> getByPrice(double price);

	boolean removeById(int pid);

	boolean updateById(int pid, int qty, double price);

}