package JDBCprojects;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatmenetex1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeepdb?user=root&password=Sandeep@123");
			
			 
			 
			 
	           
		  String sql = "insert into students values (?,?,?)";
		      
		  Scanner sk= new Scanner(System.in);
		 
		  System.out.println("Enter the Student ID ");
		  int ID = sk.nextInt();
		  sk.nextLine();
		  
		
		  System.out.println("Enter the Student Name ");
		  String Name = sk.nextLine();
			 
		  System.out.println("Enter the Student city ");
		  String City = sk.nextLine();
		 
		      
			 
			 
			 PreparedStatement ps = con.prepareStatement(sql);
	           
	            ps.setInt(1,ID);
	            ps.setString(2,Name); 
	            ps.setString(3,City);
	      
	            
	            
	            
	            
		
		int i = ps.executeUpdate();
		
		
		if(i>0) {
			System.out.println("Data inserted into table succesfully");
		}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
