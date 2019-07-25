package tw.johnyeh.javaproject.oop.bussinesslogical;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import tw.johnyeh.javaproject.oop.jdbc.TestjdbcConnDataSource;

public class StudentDaoJdbcImpl implements IStudentDao {

	private Connection conn;
	private TestjdbcConnDataSource jdbcDio;

	public StudentDaoJdbcImpl() throws IOException {

		jdbcDio = new TestjdbcConnDataSource();

	}

	@Override
	public void add(Student s) throws SQLException {
		String sqlcode = "insert into student(name,course) values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setString(1, s.getName());
		state.setString(2, s.getCourse());

		int rs = state.executeUpdate();
		state.close();


	}

	@Override
	public void update(Student s) throws SQLException {
		String sqlstr = "Update student Set course=? Where id=? and name=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setString(1, s.getCourse());
		state.setInt(2, s.getId());
		state.setString(3, s.getName());
		state.executeUpdate();
		state.close();
		System.out.println("update success.");

	}

	@Override
	public void dalete(int id) throws SQLException {
		String sqlstr = "Delete From student Where id=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setInt(1, id);
		state.execute();
		state.close();
		System.out.println("delete success.");

	}

	@Override
	public Student findById(int id) throws SQLException {
		Student s = null;
		String sqlstr = "Select * From student Where id=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setInt(1, id);
		ResultSet rs = state.executeQuery();
		if (rs.next()) {
			s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setCourse(rs.getString(3));
		}
		rs.close();
		state.close();
		return s;
	}

	@Override
	public void createConn() throws SQLException {
		conn = jdbcDio.getConnection();
		System.out.println("status  " + !conn.isClosed());

	}

	@Override
	public void closeConn() throws SQLException {
		jdbcDio.closeConn();

	}
	public void queryDbWithJson() throws SQLException, JSONException {
		String sqlstr = "Select * From student";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		ResultSet rs = state.executeQuery();
		
		JSONArray jArray = new JSONArray();
		
		while(rs.next()) {
			JSONObject jObject = new JSONObject();
			jObject.put("id", rs.getInt(1));
			jObject.put("name", rs.getString(2));
			jObject.put("course", rs.getString(3));
			
			jArray.put(jObject);
		}
		
		String jsonString = jArray.toString();
		System.out.println("jsonString:" + jsonString);
		for (int i = 0;i<jArray.length();i++) {
			JSONObject obj = (JSONObject)jArray.get(i);
			System.out.println(obj);
		}
		
		rs.close();
		state.close();
	}

}
