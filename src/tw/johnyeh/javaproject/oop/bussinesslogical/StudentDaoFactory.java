package tw.johnyeh.javaproject.oop.bussinesslogical;

import java.io.IOException;

public class StudentDaoFactory {
public static IStudentDao createStudentDao() throws IOException {
	IStudentDao sDao = new StudentDaoJdbcImpl();
	return sDao;
	
}
}
