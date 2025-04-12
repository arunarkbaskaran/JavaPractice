package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExDatabaseConnection {

	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aruntestdb","root","PAssw0rd__123");
			System.out.println(con.isValid(5));
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from agents");
			System.out.println(rs.toString());
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
