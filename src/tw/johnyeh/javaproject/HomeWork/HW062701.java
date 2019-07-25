package tw.johnyeh.javaproject.HomeWork;

import java.util.Scanner;

public class HW062701 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Number = scanner.nextInt();
		if (Number >= 0) {
			System.out.println("是正數");
			if (Number % 2 == 1) {
				System.out.println("是基數");
			} else {
				System.out.println("是偶數");
			}
		} else {
			System.out.println("是負數");

			if (Number % 2 == 0) {
				System.out.println("是偶數");
			} else {
				System.out.println("是基數");
			}
		}
	}
}
