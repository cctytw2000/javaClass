package tw.johnyeh.javaproject.oop.exception;

import java.util.Scanner;

public class TestExceptionwEX01 {

	public static void main(String[] args) {
		System.out.println("請輸入被除數");
		int a = new Scanner(System.in).nextInt();

		System.out.println("請輸入除數");
		int b = new Scanner(System.in).nextInt();
//		int a_int = a;
//
//		int b_int = b;
		try {
			System.out.println("a/b=" + a / b);
		} catch (ArithmeticException e) {
			System.out.println("除數請輸入大於0的整數"+"  "+e);
			b = new Scanner(System.in).nextInt();
			System.out.println("a/b=" + a / b);
		}

	}

}
