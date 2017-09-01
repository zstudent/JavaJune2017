package lesson170901.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/Example", "root", "");

		System.out.println(connection);
		
		Statement statement = connection.createStatement();
		
		printUsers(statement);
		
		statement.execute("insert into Users set name= " + "'Ann',  password ='dfgd'");
		
		printUsers(statement);
	}

	public static void printUsers(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("select * from Users");
		
		System.out.println(resultSet);
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String password = resultSet.getString("password");
			System.out.println(name + " " + password);
		}
	}

}
