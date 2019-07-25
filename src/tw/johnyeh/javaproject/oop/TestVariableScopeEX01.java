package tw.johnyeh.javaproject.oop;

public class TestVariableScopeEX01 {

	int a = 1;
	static int b = 2;

	public void f(int c) {
		int d = 4;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}

	public static void f2(int e) {
//		System.out.println("a=" + a);
		System.out.println("b2=" + b);
//		System.out.println("c=" + c);
//		System.out.println("d=" + d);
		System.out.println("e2=" + e);
	}

	public static void main(String[] args) {
		TestVariableScopeEX01 Answer = new TestVariableScopeEX01();
		Answer.f(3);
		System.out.println();
		Answer.f2(4);
		System.out.println();
		TestVariableScopeEX01.f2(5);
		System.out.println();
		
		f2(6);
		System.out.println();
		
		System.out.println("b3=" + b);
		System.out.println("finished");
		

	}

}
