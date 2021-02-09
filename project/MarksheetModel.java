package in.com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class MarksheetModel {
	
 public void add(MarksheetBean bean) throws Exception {
	 ResourceBundle rb = ResourceBundle.getBundle("in.com.project.Resouce");
	Class.forName(rb.getString("driver"));
	Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
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
 

public void update(MarksheetBean bean) throws Exception {
	 ResourceBundle rb = ResourceBundle.getBundle("in.com.project.Resouce");
	 Class.forName(rb.getString("driver"));
	 Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
	 conn.setAutoCommit(false);
	 PreparedStatement ps= conn.prepareStatement("update Marksheet set RollNo= ?,Fname= ?,Lname= ?,Physics= ?,Chemistry= ?,Maths= ? where id=?");
	 ps.setString(2, bean.getFirstName());
	 ps.setString(1, bean.getRollNo());
	 ps.setString(3, bean.getLastName());
	 ps.setInt(4, bean.getPhysics());
	 ps.setInt(5, bean.getChemistry());
	 ps.setInt(6, bean.getMaths());
	 ps.setInt(7, bean.getId());
	 ps.executeUpdate();
	 conn.commit();
	 System.out.println("Updated");
	 ps.close();
	 conn.close();
	
}

public void delete(MarksheetBean bean) throws Exception {
	 ResourceBundle rb = ResourceBundle.getBundle("in.com.project.Resouce");
	 Class.forName(rb.getString("driver"));
	 Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
	 conn.setAutoCommit(false);
	 PreparedStatement ps= conn.prepareStatement("delete from Marksheet where RollNo=?");
	 ps.setString(1, bean.getRollNo() );
	 ps.executeUpdate();
	 conn.commit();
	 System.out.println("Deleted");
	 ps.close();
	 conn.close();
}

public void Get(MarksheetBean bean) throws Exception {
	 ResourceBundle rb = ResourceBundle.getBundle("in.com.project.Resouce");
	 Class.forName(rb.getString("driver"));
	 Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
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
	 ps.close();
	 conn.close();
}

public void Meritlist(MarksheetBean bean) throws Exception {
	 ResourceBundle rb = ResourceBundle.getBundle("in.com.project.Resouce");
	 Class.forName(rb.getString("driver"));
	 Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
	 PreparedStatement ps= conn.prepareStatement("select * , (Physics+Chemistry+Maths) as Total, (Physics+Chemistry+Maths)/300*100 as Percentage from Marksheet order by Total desc limit 0,1");
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
		 System.out.println(rs.getString(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
		 System.out.println(rs.getString(4));
		 System.out.println(rs.getString(5));
		 System.out.println(rs.getString(6));
		 System.out.println(rs.getString(7));
		 System.out.println(rs.getString(8));
		 System.out.println(rs.getString(9));
	 }
	 ps.close();
	 conn.close();
}

public void Search(MarksheetBean bean) throws Exception {
	 ResourceBundle rb = ResourceBundle.getBundle("in.com.project.Resouce");
	 Class.forName(rb.getString("driver"));
	 Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
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
	 ps.close();
	 conn.close();
}
}
