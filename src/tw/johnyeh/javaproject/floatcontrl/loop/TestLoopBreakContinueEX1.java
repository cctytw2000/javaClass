package tw.johnyeh.javaproject.floatcontrl.loop;

public class TestLoopBreakContinueEX1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
//				break;
			}
			System.out.println("i=" + i);
		}
		System.out.println("finish");
	}
}
