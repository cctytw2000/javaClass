package tw.johnyeh.javaproject.floatcontrl.loop;

public class TestWhileLoopNestedEX01 {

	public static void main(String[] args) {
		int j = 1;
		while (j <= 3) {
			int i = 1;
			while (i <= 10) {
				System.out.print("@");
				i++;
			}
			System.out.println();
			j++;
		}

	}

}
