package tw.johnyeh.javaproject.oop.array;

public class TestEnhancedForEX01 {

	public static void main(String[] args) {
		int[] answer = { 1, 2, 3, 4, 5 };
		for (int i : answer) {
			System.out.println(i);
		}
		int[][] answer1 = { { 1,2,3,4 }, { 5,6,7 } };
		for (int[] a : answer1) {
			for (int b : a) {
				System.out.println("b=" + b);
			}
		}
	}

}
