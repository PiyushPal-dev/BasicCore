package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws Exception {
  
   add();
}

public static void add() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Rays", "root", "root");
  Statement st = conn.createStatement();
  int i= st.executeUpdate("update Employee set Name = 'Virat' where id=4");
  System.out.println("Updated");
  st.close();
  conn.close();
}
}
