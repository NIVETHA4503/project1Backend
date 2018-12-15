package com.niit.dao;

import com.niit.models.Product;

public interface ProductDao {
	void addProduct(Product product);
	Product getProduct(int id);
	void deleteProduct(int id);
	void updateProduct(Product product);
	

}
