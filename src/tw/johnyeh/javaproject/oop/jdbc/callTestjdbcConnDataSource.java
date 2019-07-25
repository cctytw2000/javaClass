package tw.johnyeh.javaproject.oop.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class callTestjdbcConnDataSource {

	private TestjdbcConnDataSource jdbc;
	private Connection conn;
	private ArrayList<String> MemberNames;

	public callTestjdbcConnDataSource() throws IOException, SQLException {
		jdbc = new TestjdbcConnDataSource();
		conn = jdbc.getConnection();
		boolean status = !conn.isClosed();
		System.out.println("status = " + status);

	}

	public void verifiedProfiles(String user, String pwd) throws SQLException {
		String sqlcode = "select * from members where username = ? and password = ?";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setString(1, user);
		state.setString(2, pwd);
		ResultSet rs = state.executeQuery();
		boolean checkstatus = rs.next();
		if (checkstatus) {
			System.out.println("welcome to Data Base.");
		} else {
			System.out.println("username or password Error");
		}
		rs.close();
		state.close();

	}

	public void closeconnSqlserver() throws SQLException {
		jdbc.closeConn();
	}

	public void queryDB() throws SQLException {
		MemberNames = new ArrayList<String>();
		Statement state = conn.createStatement();
		String sqlcode = "select * from member";
		ResultSet rs = state.executeQuery(sqlcode);
		while (rs.next()) {

			String member_name = rs.getString(2);

			MemberNames.add(member_name);

		}
		System.out.println(MemberNames);
		rs.close();
	}

	public void insertDB_batch() throws SQLException {
		Statement state = conn.createStatement();
		for (int i = 0; i < MemberNames.size(); i++) {
			String membernames = MemberNames.get(i);
			String memberPWD = membernames + "_system_" + (int) (Math.random() * 1000000000 + 1);
			state.addBatch("insert into members (username,password) values('" + membernames + "','" + memberPWD + "')");
		}
		int[] rs = state.executeBatch();
		state.close();
		System.out.println("新增了" + rs.length + "筆資料");
	}
	public void insertDB_preparedStatement() throws SQLException {
		String sqlcode = "insert into members(username,password) values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		for(String name : MemberNames) {
			state.setString(1, name);
			state.setString(2, "john_system_" + (int) (Math.random() * 1000000000 + 1));
			state.addBatch();
		}
		int[] rs = state.executeBatch();
		state.close();
		System.out.println("新增了" + rs.length + "筆資料");
	}

	public static void main(String[] args) throws IOException, SQLException {
		callTestjdbcConnDataSource workSQLserver = new callTestjdbcConnDataSource();
//		workSQLserver.verifiedProfiles("asdsadasd", "jteasdsade");
		workSQLserver.verifiedProfiles("john", "jtes5505");

		workSQLserver.queryDB();
		workSQLserver.insertDB_preparedStatement();
//		workSQLserver.insertDB_batch();
		workSQLserver.closeconnSqlserver();

	}

}
