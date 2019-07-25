package tw.johnyeh.javaproject.oop;

class car {
	int prict = 2000000;
	String name = "iii";
}

public class TestEqualsEX01 {

	public static void main(String[] args) {
		car car1 = new car();
		car car2 = new car();
		
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
//		System.out.println(car1);
//		System.out.println(car2);

		car1 = car2;
		
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
//		System.out.println(car1);
//		System.out.println(car2);
	}

}
