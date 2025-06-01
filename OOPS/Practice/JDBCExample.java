package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("DBDriver");
		Connection con = DriverManager.getConnection("idbc:odbc:dbName", "admin", "Password");
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("Select * from Employees;");
		while (result.next()) {
			System.out.println(result.getString(0) + " " + result.getString(2));
		}
		result.close();
		con.close();
	}

}
