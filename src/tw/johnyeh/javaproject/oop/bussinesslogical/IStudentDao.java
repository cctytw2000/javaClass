package tw.johnyeh.javaproject.oop.bussinesslogical;

import java.sql.SQLException;

import org.json.JSONException;

public interface IStudentDao {
	public void add(Student s) throws SQLException;

	public void update(Student s) throws SQLException;

	public void dalete(int id) throws SQLException;

	public Student findById(int id) throws SQLException;

	public void createConn() throws SQLException;

	public void closeConn() throws SQLException;
	
	public void queryDbWithJson() throws SQLException, JSONException;



}
