package tw.johnyeh.javaproject.oop.bussinesslogical;

import java.io.IOException;
import java.sql.SQLException;

import org.json.JSONException;

public class CallTestStudentDioAction {

	public static void main(String[] args) throws IOException, SQLException, JSONException {
//		StudentDaoJdbcImpl stuDIO = new StudentDaoJdbcImpl();
//
//		stuDIO.createConn();
//		Student stu = new Student();
//		stu.setName("Tony");
//		stu.setCourse("Java");
////		stuDIO.add(stu);
//		stuDIO.update(stu);
//		stuDIO.closeConn();
		IStudentDao stuDF = StudentDaoFactory.createStudentDao();

		Student stu = new Student();
//		stu.setId(1);
//
//		stuDF.createConn();
//
//		Student stu_data = stuDF.findById(stu.getId());
//
//		System.out.println(stu_data.getId());
//		System.out.println(stu_data.getName());
//		System.out.println(stu_data.getCourse());
		stuDF.createConn();
//		stu.setId(2);
//		stuDF.dalete(stu.getId());
		stuDF.queryDbWithJson();
//		stu.setId(1);
//		stu.setName("John");
//		stu.setCourse("Python");
//		stuDF.update(stu);
		
		
//		stu.setName("Tony");
//		stu.setCourse("Java");
//		stuDF.add(stu);
		stuDF.closeConn();
	}

}
