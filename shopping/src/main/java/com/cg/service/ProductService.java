package com.cg.service;

import com.cg.dao.ProductDao;
import com.cg.model.Product;

public class ProductService {
	
	Product pl=new Product();
	ProductDao pd=new ProductDao();
	public void addProductDetails(int cost,String brand,int money) {
		pl.setBrand(brand);
		pl.setCost(cost);
		pl.setMoney(money);
		
		if(cost<1000 && brand.matches("[a-zA-z]+") && money>0) {
			pd.displayProductDetails(cost,brand,money);
		}
		
	}
}
