package com.industry.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{

	
		public static boolean validate(String user_id, String pass_word)
		{
			boolean status =false;
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login?useSSL=false","root","root");
			
			String logq="select * from industry where userid = ? and password = ?";
			
			PreparedStatement ps=con.prepareStatement(logq);
			ps.setString(1, user_id);
			ps.setString(2, pass_word);
			
			ResultSet rs = ps.executeQuery();
			status=rs.next();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			return status;	
			
			
		}

	}

