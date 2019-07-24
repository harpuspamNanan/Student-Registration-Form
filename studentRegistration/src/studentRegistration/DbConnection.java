package studentRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection dbConnection(String dbName) throws ClassNotFoundException, SQLException{
		Connection conn =null;
		
		if(dbName.equalsIgnoreCase("mysql")){
			Class.forName("com.mysql.jdbc.Driver");  
			 conn=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Database","username","password");
			return conn;
		}
		else{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			conn=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
			  return conn;
		}
	}
	
}
