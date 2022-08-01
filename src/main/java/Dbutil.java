import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	static Connection connection;

	public static Connection getDbConnectio() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Zqaws123!");
			System.out.println("connection Successfully...");

		} catch (SQLException e) {
			System.out.println("connection fails...");
		}
		return connection;
	}

	public static void closeDbConnection() {
		try {
			if (connection != null)

				connection.close();
			System.out.println("connection close...");
		} catch (SQLException e) {
			System.out.println("Error! connection closing...");
		}
	}
}
