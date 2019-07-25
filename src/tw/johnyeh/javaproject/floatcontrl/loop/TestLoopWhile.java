package tw.johnyeh.javaproject.floatcontrl.loop;

public class TestLoopWhile {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
//		while (x<=10) {
//			y = y + x ;
//			x++;
//			System.out.println(y);
//		}
//		System.out.println("1加到10="+y);
//		while (x <= 100) {
//			if (x % 2 == 1) {
//				System.out.println(x + "是基數");
//			} else {
//				System.out.println(x + "是偶數");
//			}
//			x++;
//		}
		while (x<=1000000) {
			System.out.println("Hello"+" " + x);
			x++;
		}
		System.out.println("finish");
		
		

	}

}
