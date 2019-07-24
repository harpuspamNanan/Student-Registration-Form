package studentRegistration;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con =DbConnection.dbConnection("Oracle");
		//UsersTable.insertRecord("Bableen123", "password", "Bableen", "Kaur", con);
		//UsersTable.updateRecord("Bableen123", "1234",con);

		UsersTable.deleteRecord("Bableen123", con);
	}

}