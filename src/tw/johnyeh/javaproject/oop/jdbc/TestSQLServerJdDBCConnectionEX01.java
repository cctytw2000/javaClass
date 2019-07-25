package tw.johnyeh.javaproject.oop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestSQLServerJdDBCConnectionEX01 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=member;user=sa;password=passw0rd";
		Connection conn = DriverManager.getConnection(connUrl);
		Statement state = conn.createStatement();
		String sqlcode = "SELECT * FROM Product";
		ResultSet rs = state.executeQuery(sqlcode);

		boolean status = !conn.isClosed();
		System.out.println("SQLServer status = " + status);

		ResultSetMetaData metadata = rs.getMetaData();
		int columnCount = metadata.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String name = metadata.getColumnName(i);
			System.out.print(name + "\t");

		}
		System.out.println();
		while (rs.next()) {

			for (int i = 1; i <= columnCount; i++) {

				if (i != 1) {

					System.out.print("\t\t");
					System.out.print(rs.getString(i));
				} else {

					System.out.print(rs.getString(i));
				}
			}
			System.out.println();

//			System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
//			System.out.println(rs.getInt("ProductID") + "\t\t" + rs.getString("ProductName") + "\t\t"
//					+ rs.getString("ProductPrice"));

		}
		rs.close();
		state.close();
		conn.close();

	}

}
