package tw.johnyeh.javaproject.oop.exception;

public class TestExceptionwEX02 {
	public void division(int x, int y) {
		try {
			System.out.println("x/y=" + x / y);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Exception=" + e);
			System.out.println("你必須輸入比0大的整數");
//			System.exit(0);
		} finally {
			System.out.println("finished");
		}

	}

	public static void main(String[] args) {
		TestExceptionwEX02 except = new TestExceptionwEX02();
		except.division(10, 2);

	}

}
