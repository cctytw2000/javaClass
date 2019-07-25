package tw.johnyeh.javaproject.oop.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQLServerJdDBCConnectionEX02 {
	private Connection conn;

	public void connSqlserver() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=member;user=sa;password=passw0rd";
		conn = DriverManager.getConnection(connUrl);
		boolean status = !conn.isClosed();
		System.out.println("SQLServer status = " + status);
	}

	public static void main(String[] args) {
		TestSQLServerJdDBCConnectionEX02 sql = new TestSQLServerJdDBCConnectionEX02();

		try {
			sql.connSqlserver();

//			sql.SQLSelectQuery();
//			sql.SQLInsertQuery();
//			sql.SQLSelectQuery();
//			sql.SQLUpdateQuery();
//			sql.SQLDeleteQuery();
//			sql.SQLSelectQuery();
			sql.processStorgeProcstate();
			sql.closeSqlServer();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void SQLUpdateQuery() throws SQLException {
		String sqlcode = "update Product set ProductName = ? where ProductName = ?";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setString(1, "necklace");
		state.setString(2, "oldCellPhone");
		int count = state.executeUpdate();
		System.out.printf("您修改%d筆資料\n", count);
		state.close();
	}

	public void SQLInsertQuery() throws SQLException {
		String sqlcode = "insert into Product(ProductName,ProductPrice) values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setString(1, "Cookie");
		state.setString(2, "20");
		int count = state.executeUpdate();
		System.out.printf("您新增%d筆資料\n", count);
		state.close();
	}

	public void SQLSelectQuery() throws SQLException {
		Statement state = conn.createStatement();
		String sqlcode = "SELECT * FROM Product";
		ResultSet rs = state.executeQuery(sqlcode);

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
	}

	public void SQLDeleteQuery() throws SQLException {
		String sqlcode = "delete from Product where ProductID = ?";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setInt(1, 7);
		int count = state.executeUpdate();
		System.out.printf("您已刪除%d筆資料", count);
		state.close();

	}
public void processStorgeProcstate() throws SQLException {
	CallableStatement state = conn.prepareCall("{call getmembername(?,?)}");
	state.registerOutParameter(2, java.sql.Types.VARCHAR);
	state.setInt(1,18);
	state.execute();
	System.out.println("name="+state.getString(2));
	state.close();
}
	public void closeSqlServer() throws SQLException {
		conn.close();
	}
}
