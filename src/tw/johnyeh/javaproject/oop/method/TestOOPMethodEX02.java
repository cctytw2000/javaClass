package tw.johnyeh.javaproject.oop.method;

class Computer {
	public void add(int x, int y) {
		System.out.printf("%d+%d=%d\n", x, y, x + y);
	}

	public void sub(int x, int y) {
		System.out.printf("%d-%d=%d\n", x, y, x - y);
	}

	public void mulit(int x, int y) {
		System.out.printf("%d*%d=%d\n", x, y, x * y);
	}

	public void division(float x, float y) {
		System.out.printf("%d/%d=%3.2f\n", (int)(x), (int)(y), (x / y));
		
//		if (x % y != 0) {
//			System.out.printf("%d/%d=%d....%d\n", x, y, x / y, x % y);
//		}else {
//			System.out.printf("%d/%d=%d\n", x, y, x / y);
//		}
	}
}

public class TestOOPMethodEX02 {

	public static void main(String[] args) {
		float a = 9;
		float b = 2;
		System.out.println(a/b);
		Computer computer = new Computer();
		computer.add(2, 3);
		computer.sub(10, 3);
		computer.mulit(5, 2);
		computer.division(9, 2);
		
		
		

	}

}
