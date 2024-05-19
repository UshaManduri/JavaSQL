package com.jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1512:xe","Sagar", "tiger");
		Statement st = con.createStatement();
		st.executeUpdate("create table emp (empno number(3), ename varchar2(10), age number(2))");
	//  st.executeUpdate("insert into emp (empno, ename, age) values(101,'A',1)");
	//  System.out.println("one row inserted");	
		System.out.println("Table created");
		con.close();
	}

}
