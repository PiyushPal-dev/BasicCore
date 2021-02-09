package in.com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModel {
// To Insert Data	
 public void add(MarksheetBean bean) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Rays","root","root");
	conn.setAutoCommit(false);
	PreparedStatement ps= conn.prepareStatement("insert into Marksheet values(?,?,?,?,?,?,?)");
	ps.setInt(1, bean.getId());
	ps.setString(3,bean.getFirstName());
	ps.setString(4,bean.getLastName());
	ps.setString(2,bean.getRollNo());
	ps.setInt(5,bean.getPhysics());
	ps.setInt(6,bean.getChemistry());
	ps.setInt(7,bean.getMaths());
	ps.executeUpdate();
	conn.commit();
	System.out.println("Inserted");
	ps.close();
	conn.close();
 }
 
// To Update Data
public void update(MarksheetBean bean) throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Rays","root","root");
	 conn.setAutoCommit(false);
	 PreparedStatement ps= conn.prepareStatement("update Marksheet set Fname= ? where id=?");
	 ps.setString(1, bean.getFirstName());
	 ps.setInt(2, bean.getId());
	 ps.executeUpdate();
	 conn.commit();
	 System.out.println("Updated");
	 ps.close();
	 conn.close();
	
}
// For Deletion
public void delete(MarksheetBean bean) throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Rays","root","root");
	 conn.setAutoCommit(false);
	 PreparedStatement ps= conn.prepareStatement("delete from Marksheet where RollNo=?");
	 ps.setString(1, bean.getRollNo() );
	 ps.executeUpdate();
	 conn.commit();
	 System.out.println("Deleted");
	 ps.close();
	 conn.close();
}
// To get Data by RollNo.
public void Get(MarksheetBean bean) throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Rays","root","root");
	 conn.setAutoCommit(false);
	 PreparedStatement ps= conn.prepareStatement("select * from Marksheet where Rollno = ?");
	 ps.setString(1,bean.getRollNo());
	 
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
		 System.out.println(rs.getString(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
		 System.out.println(rs.getString(4));
		 System.out.println(rs.getString(5));
		 System.out.println(rs.getString(6));
		 System.out.println(rs.getString(7));
	 }
	 conn.commit();
	 ps.close();
	 conn.close();
}
// To get Merit List
public void Meritlist(MarksheetBean bean) throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Rays","root","root");
	 conn.setAutoCommit(false);
	 PreparedStatement ps= conn.prepareStatement("select * , (Physics+Chemistry+Maths) as Total from Marksheet order by Total desc limit 0,1");
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
		 System.out.println(rs.getString(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
		 System.out.println(rs.getString(4));
		 System.out.println(rs.getString(5));
		 System.out.println(rs.getString(6));
		 System.out.println(rs.getString(7));
	 }
	 conn.commit();
	 ps.close();
	 conn.close();
}

public void Search(MarksheetBean bean) throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Rays","root","root");
	 conn.setAutoCommit(false);
	 System.out.println("ID   RollNo   FirstName   Lastname   Physics   Chemistry   Maths");
	 PreparedStatement ps= conn.prepareStatement("select * from Marksheet");
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
		 System.out.print(rs.getString(1));
		 System.out.print("\t"+rs.getString(2));
		 System.out.print("\t"+rs.getString(3));
		 System.out.print("\t\t"+rs.getString(4));
		 System.out.print("\t"+rs.getString(5));
		 System.out.print("\t"+rs.getString(6));
		 System.out.println("\t\t"+rs.getString(7));
	 }
	 conn.commit();
	 ps.close();
	 conn.close();
}
}
