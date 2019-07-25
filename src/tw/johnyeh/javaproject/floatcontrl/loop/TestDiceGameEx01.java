package tw.johnyeh.javaproject.floatcontrl.loop;

import java.util.Scanner;

public class TestDiceGameEx01 {

	public static void main(String[] args) {
		Scanner scannerLuckyNumber = new Scanner(System.in);
		int yourLuckyNumber = scannerLuckyNumber.nextInt();
		Scanner scannerChance = new Scanner(System.in);
		int chanceCount = 0 ;
		int count = 0;
		int Yourchance = scannerChance.nextInt();
		while (true) {
			int DiceNumber = (int) ((Math.random()) * 6 + 1);
			if (yourLuckyNumber == DiceNumber) {
				if (count <= Yourchance) {
					if (count == 3) {
						System.out.println(yourLuckyNumber);
						System.out.println(DiceNumber);
						System.out.println("Bingo !!");
						break;
					}
					count++;
				}else {
					System.out.println("Sorry you Don't have chance.");
					break;
				}
				
			} else {
				System.out.println("wanna see you agin !!");
			}
			System.out.println("finish");
		}

	}

}
