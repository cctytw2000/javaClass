package tw.johnyeh.javaproject.floatcontrl.loop;

public class TestLoopSwitch {

	public static void main(String[] args) {
		long sum = 0;
		int i = 1;
		while (i <= 1000000) {
			sum = sum + i;
			System.out.println("i= " + i);
			System.out.println("sum= " + sum);
			i++;
		}
		System.out.println(" ");
		System.out.println("sum = " + sum);
	}
}
