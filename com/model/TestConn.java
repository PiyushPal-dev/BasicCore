package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConn {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Rays", "root", "root");
  Statement st = conn.createStatement();
  ResultSet rs= st.executeQuery("Select * from Employee");
  System.out.println("id \t FName \t\t City ");
  while(rs.next()) {
	  System.out.print(rs.getString(1));
	  System.out.print("\t" +rs.getString(2));
	  System.out.print("\t\t" +rs.getString(3));
	  System.out.println();
  }
  st.close();
  conn.close();
}
}
