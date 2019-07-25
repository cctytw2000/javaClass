package tw.johnyeh.javaproject.oop.overloading;

public class TestOverLoadingEX01 {
	public void sum(int x, int y) {
		System.out.printf("%d+%d=%d\n", x, y, x + y);
	}

	public void sum(double x, double y) {
		System.out.printf("%3.2f+%3.2f=%3.2f\n", x, y, x + y);
	}

	public static void main(String[] args) {
		TestOverLoadingEX01 overload = new TestOverLoadingEX01();
		overload.sum(3, 4);
		overload.sum(3.14, 4.28);
		overload.sum('a',6);
		overload.sum((char)6, 7);

	}

}
