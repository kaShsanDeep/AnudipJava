package JDBCprojects;

/*
 * JDBC java database connector
 * steps:   import java.sql.*;
 *          load our driver: class.forName();
 *          connection:   driverManager.getConnection("");
 *          Statement/preparedStatement : connection.createStatement()/connection.prepareStatement()
 *          ResultSet: statement.executeQuery()/preparedStatement.executeQuery();
 *          close all connection and streams 
 *           
 * 
 */
import java.sql.*;
public class Example1 {

	public static void main(String[] args) {
	
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeepdb?user=root&password=Sandeep@123");
		 
		            // Step 3: Create a statement
		            Statement statement = con.createStatement();
		            String sql = "insert into students values ('010','ankush','Delhi')";
			
			int i = statement.executeUpdate(sql);
			if(i>0) {
				
				System.out.println("Data inserted into table succesfully");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
