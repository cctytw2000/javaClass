package tw.johnyeh.javaproject.oop.exception;

public class TestCalculateCircleAreaEx1 {
	public void CalculateCircleArea(double radius) {
		System.out.println(3.14 * radius * radius);
	}

	public static void main(String[] args) {
		if (args.length >= 1) {
			try {
				double myRadius = Double.parseDouble(args[0]);
				TestCalculateCircleAreaEx1 CircleArea = new TestCalculateCircleAreaEx1();
				CircleArea.CalculateCircleArea(myRadius);
			} catch (NumberFormatException e) {
				System.out.println("please insert Correct number");

			}
		} else {
			System.out.println("please insert number");
		}

	}

}
