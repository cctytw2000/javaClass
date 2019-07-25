package tw.johnyeh.javaproject.oop.nestedclasses;

class c {
	private static int age = 18;

	static class d {
		public void show() {
			System.out.println("show Above AGE=" + age + "+");
		}
	}
}

class e {
	private String Direction = "north";

	public void sendDirection() {

		double latitude = 25.036, longitude = 120.321;
		class f {
			public void guide() {
				System.out.println("latitude ；" + latitude);
				System.out.println("longitude ；" + longitude);
				System.out.println("Direction ；" + Direction);
			}
		}
		f f1 = new f();
		f1.guide();
	}
}

public class TestNestedClassesEX02 {

	public static void main(String[] args) {
		c.d d1 = new c.d();
		d1.show();

		e e1 = new e();
		e1.sendDirection();

	}

}
