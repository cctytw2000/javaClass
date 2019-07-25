package tw.johnyeh.javaproject.floatcontrl.loop;

public class TestLoopWhileNested {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 9) {
			int y = 1;
			while (y <= 9) {
				System.out.printf("%dx%d=%2d\t", x, y, x * y);
				y++;
			}
			System.out.println();
			x++;
		}
	}
}
