package tw.johnyeh.javaproject.floatcontrl;

public class TestIfElse {

	public static void main(String[] args) {
		int MyLuckyNumber = 3;
		boolean Game = true;
		int count = 0;
		while (Game) {

			int Number = (int) ((Math.random()) * 6 + 1);
			System.out.println(Number);
			if (Number == MyLuckyNumber) {
				System.out.println("You Win !");
				Game = false;
				count++;
			} else {
				System.out.println("Try Agin");
				count++;

			}
			System.out.println("count = " + count);
			System.out.println("Game Over");
		}

	}

}
