package tw.johnyeh.javaproject.oop.nestedclasses;

public class TestNestedClassesEX04 {
	public void processAction(Fish fish) {
		fish.eat();
	}

	public static void main(String[] args) {
		Fish Fishtest = new Fish() {

			@Override
			public void eat() {
				System.out.println("eat outside bigfish");

			}

		};
		Fishtest.eat();
		TestNestedClassesEX04 test = new TestNestedClassesEX04();
		
		
		test.processAction(Fishtest);
		test.processAction(new Fish() {

			@Override
			public void eat() {
				System.out.println("eat inside fish");

			}

		});
		

	}

}
