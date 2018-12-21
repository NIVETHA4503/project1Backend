package com.niit.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.models.Product;
@Repository  
@Transactional 
public class ProductDaoImpl implements ProductDao {
	@Autowired
private SessionFactory sessionFactory;
	public ProductDaoImpl(){
		System.out.println("ProductDaoImpl bean is created..");
	}
//	public void addProduct(Product product) {
//       Session session= sessionFactory.getCurrentSession();
//       session.save(product);
//	}
	public Product getProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		return product;
	}
	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		session.delete(product);
	}
//	public void updateProduct(Product product) {
//		Session session=sessionFactory.getCurrentSession();
//		session.update(product);
//	}
	public java.util.List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Product");
		List<Product> products =query.list();
		return products;
	}
	public void saveOrUpdate(Product product) {
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(product);
		
	}
	
	

}