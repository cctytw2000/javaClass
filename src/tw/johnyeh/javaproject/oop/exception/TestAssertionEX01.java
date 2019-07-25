package tw.johnyeh.javaproject.oop.exception;

public class TestAssertionEX01 {

	public static void main(String[] args) {
		int x = 5, y = 0;
		assert y != 0 : "Y must to bigger than 0";
		System.out.println("x/y=" + (x / y));

	}

}
