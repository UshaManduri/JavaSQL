//package com.tasksforusha;
//
//import java.io.FileReader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//
//import com.opencsv.*;
//
//public class ReadCSVFileandInsertintoDB {
//
//	public static void main(String[] args) {
//		String csvFilePath = "Task_1.csv";
//		String dbUrl = "jdbc:mysql://localhost:3306/Documents"; // "jdbc:oracle:thin:@localhost:1521:xe","usha", "1995";
//		String username = "usha";
//		String password = "1995";
//		
//		try(Connection connection = DriverManager.getConnection(dbUrl,username, password);
//				FileReader fileReader = new FileReader(csvFilePath);
//				CSVReader csvReader = new CSVReader(fileReader)) {
//			
//			String insertQuery = "INSERT INTO Task_1(Sl.no, Rollno,Name, Age, Gender) VALUES (?,?,?,?,?)"; // 'task_1' need to be replaced by db table
//			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//			
//			String[] record;
//			while ((record = csvReader.readNext()) != null) {
//				for(int i = 0; i<record.length; i++) {
//					preparedStatement.setString(i+ 1,record[i]);
//				}
//				preparedStatement.executeUpdate();
//			}
//			System.out.println("Data inserted successfully");
//		
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
