package com.jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		//register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//to create a connection: connection is a Interface, drivermanager is class+ get conn.
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","usha", "1995");
		
		// statement- interface 
		Statement st = con.createStatement();
		
		//int stCnt = st.executeUpdate("create table emp (empno number(3), ename varchar2(10), age number(2))");
	  //  st.executeUpdate("insert into emp (empno, ename, age) values(103,'C',3)");
	//	st.executeUpdate("update emp set age=13 where empno=103");
	//	st.executeUpdate("delete from emp where empno=101");
		st.executeUpdate("insert into emp(empno, ename, age) values (101, 'A' , 1)");
	//	st.executeUpdate("drop table emp");
		st.executeUpdate( " " ); //revoke table emp
		//  System.out.println("one row inserted");	
		System.out.println("Table created " );
		con.close();
		
	//	PreparedStatement prepareStatement = con.prepa
	}

}
