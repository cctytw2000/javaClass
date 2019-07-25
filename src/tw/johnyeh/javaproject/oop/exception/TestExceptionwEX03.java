package tw.johnyeh.javaproject.oop.exception;

import java.util.Calendar;
import java.util.Date;

class ExceptionwEX03 {
	public void processAction(Date Time) throws NullPointerException, Exception {
		long myTime = Time.getTime();
		System.out.println(myTime);
		System.out.println(Time);

		Calendar c1 = Calendar.getInstance();
		int year  = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH)+1;
		int day = c1.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.printf("%d/%d/%d",year,month,day);
		
	}
}

public class TestExceptionwEX03 {

	public static void main(String[] args) {
		ExceptionwEX03 e = new ExceptionwEX03();
		try {
			Date Time = new Date();
			e.processAction(Time);
//			e.processAction(null);
		} catch (NullPointerException e1) {
			System.out.println("e1=" + e1);

		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("e1=" + e1);
		}

	}

}
