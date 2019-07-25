package tw.johnyeh.javaproject.HomeWork;

public class HW062702 {

	public static void main(String[] args) {
		int a = 2, b = 3, c = -2; // 兩異根
//		int a = 1, b = 3, c = 5; // 無解

		int D = (b * b) - (4 * (a * c));
//		D = 0 ;
//		System.out.println(D);
		if (D > 0) {
			double answer = (-b + ((Math.sqrt(D)))) / (2 * a);
			double answer2 = (-b - ((Math.sqrt(D)))) / (2 * a);
			System.out.println(answer);
			System.out.println(answer2);
		} else if (D<0) {
			System.out.println("無解");
		} else {
			double answer = (-b + ((Math.sqrt(D)))) / (2 * a);
			double answer2 = (-b - ((Math.sqrt(D)))) / (2 * a);
			System.out.println(answer);
			System.out.println(answer2);
			System.out.println(answer+" "+answer2+" "+"等根");
			
		}
//		double answer = (-b + Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
//		double answer2 = (-b - Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
//		System.out.println(answer);
//		System.out.println(answer2);
	}
}
