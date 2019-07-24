package studentRegistration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersTable {

	public static void insertRecord(String username, String password, 
			String firstname,String lastname, Connection con)	{
	
		PreparedStatement stmt = null;
	
		try {
			stmt = con.prepareStatement("insert into login(username,password,firstname,lastname) "
					+ "values (?,?,?,?)");
			
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, firstname);
			stmt.setString(4, lastname);
			
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				
				stmt.close();
			}
			catch(SQLException e){
				
				e.printStackTrace();
			}
		}
	}
	public static void updateRecord(String username, String password, 
			 Connection con)	{
	
		PreparedStatement stmt = null;
	
		try {
			stmt = con.prepareStatement("UPDATE LOGIN SET PASSWORD =? WHERE USERNAME =?");
			
			stmt.setString(1, password);
			stmt.setString(2, username);
			
			
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				
				stmt.close();
			}
			catch(SQLException e){
				
				e.printStackTrace();
			}
		}
	}
	
	public static void deleteRecord(String username, 
			 Connection con)	{
	
		PreparedStatement stmt = null;
	
		try {
			stmt = con.prepareStatement("delete from login where username=?");
			
			stmt.setString(1,username);
			
			
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				
				stmt.close();
			}
			catch(SQLException e){
				
				e.printStackTrace();
			}
		}
	}
}