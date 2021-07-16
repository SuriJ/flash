package com.industry.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConTest {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login?useSSL=false","root","root");
		System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
			// System.out.println(e.getMessage());
		}
	}

}
