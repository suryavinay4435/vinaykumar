package com.cg.client;

import java.util.Scanner;

import com.cg.service.ProductService;

public class Test {
	

	public static void main(String[] args) {
		ProductService pss=new ProductService(); //updated
		Scanner sc=new Scanner(System.in);
        System.out.println("plz enter how many products you want to buy");
        int k =sc.nextInt();
        for(int i=1;i<=k;i++) {
        	int cost;
        	String brand;
        	int money;
        	System.out.println("plz enter cost");
        	cost=sc.nextInt();
        	System.out.println("plz enter brand");
        	brand=sc.next();
        	System.out.println("plz enter money");
        	money=sc.nextInt();
        	pss.addProductDetails(cost, brand, money);
        }
	}

}
