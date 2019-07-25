package tw.johnyeh.javaproject.floatcontrl.loop;

public class TestLoopWhileNested2 {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 9) {
			int y = 1;
			while (y <= 9) {
				if (x * y < 10) {
					System.out.print(x + "*" + y + "= " + x * y);
					System.out.print(" ");
				} else {
					System.out.print(x + "*" + y + "=" + x * y);
					System.out.print(" ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
	}
}
