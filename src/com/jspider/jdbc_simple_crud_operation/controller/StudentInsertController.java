package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertController {
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String pass = "root";
			connection = DriverManager.getConnection(url,user,pass);
        // create statement
			Statement statement =connection.createStatement();
        //step 4 executeQuery
			String insertStudentQuery = "insert into users (id,email,password) values(422,'hasnain@gmail.com',1234)";
			statement.execute(insertStudentQuery);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("============ data inserted ============");
		}
	}

}
