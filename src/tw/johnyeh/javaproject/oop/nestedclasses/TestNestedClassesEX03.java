package tw.johnyeh.javaproject.oop.nestedclasses;

abstract class Fish {
	public abstract void eat();
}

//class Shark extends Fish{
//
//	@Override
//	public void eat() {
//		System.out.println("eat small fish.");
//	}
//	
//}
public class TestNestedClassesEX03 {

	public static void main(String[] args) {
//		Shark makoShark = new Shark();
//		makoShark.eat();

		new Fish() {

			@Override
			public void eat() {
				System.out.println("eat everything.");
			}

		}.eat();

	}

}
