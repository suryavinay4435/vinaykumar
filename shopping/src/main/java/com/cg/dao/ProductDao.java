package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {
	
	public void displayProductDetails(int cost,String brand,int money) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldatabase", "root", ""); 
				PreparedStatement ps = conn.prepareStatement("insert into Productdetails values(?,?,?)");
				ps.setInt(1,cost);
				ps.setString(2,brand);
				ps.setInt(3, money);
				
				int updatedRows = ps.executeUpdate();  //executing update
				if (updatedRows > 0) {
					System.out.println("Productdetails is sucessfully added");
				}
				conn.close();          //closing connection
			} catch (Exception e) {
				System.out.println("Check the details an exception occured");
			}
		} catch (Exception e) {
			System.out.println("Check the details an exception occured");
		}
		
	}

}
