package com.niit.dao;

import java.util.List;

import com.niit.models.Category;
import com.niit.models.Product;

public interface ProductDao {
//	void addProduct(Product product);
	Product getProduct(int id);
	void deleteProduct(int id);
//	void updateProduct(Product product);
	List<Product> getAllProducts();
	void saveOrUpdate(Product product);
	List<Category> getAllCategories();

}
