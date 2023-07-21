package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudentController {
	public static void main(String[] args) {
		//step - 1 load/register
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 create connection
			String url = "jdbc:mysql://localhost:3306/j2ee";
			String user = "root";
			String pass = "root";
			Connection connection = DriverManager.getConnection(url , user ,pass);
			
			//step 3 create statement
			Statement statement = connection.createStatement();
			//step 4 execute query
			String updateStudentEmailQuery = "update student set = '"+email+"'
			statement.executeUpdate(updateStudentEmailQuery);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
