package JDBC;
import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            // Establish connection
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/student",
	                "root",
	                "Tiger@123"
	            );

	            System.out.println("Connection Successful!");

	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
		
	}
}
