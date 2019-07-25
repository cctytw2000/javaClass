package tw.johnyeh.javaproject.floatcontrl.loop;

import java.util.Scanner;

public class TestSwitchEX01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int member = scanner.nextInt() ;
//		int member = 4;
		switch (member) {
		case 1:
			System.out.println("一般會員");
			break;
		case 2:
			System.out.println("白金會員");
			break;
		case 3:
			System.out.println("鑽石會員");
			break;
		default:
			System.out.println("訪客");
			break;
		}

	}

}
