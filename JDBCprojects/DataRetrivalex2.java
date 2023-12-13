package JDBCprojects;

import java.util.Scanner;

import java.sql.*;

public class DataRetrivalex2 {

	public static void main(String[] args) {
		
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost :3306 /sandeepdb?user=root&password=Sandeep@123");
				
		String sql= "select*from students where ID=?";

		PreparedStatement ps=con.prepareStatement(sql);

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the id of student: ");

		String id=sc.nextLine();

		
		
		ps.setString(1, id);

		ResultSet rs=ps.executeQuery();
		
		
		
		
		
		
		
		if (rs.next()) {
			System.out.println("Student ID : "+rs.getString("ID"));
			System.out.println("Student Name : "+rs.getString("Name"));
			System.out.println("Student city : "+rs.getString("City"));
			
			
		}
		else {
			System.out.println("Data not found>>>>>");
			
		}
		
		
		}
		
		
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
