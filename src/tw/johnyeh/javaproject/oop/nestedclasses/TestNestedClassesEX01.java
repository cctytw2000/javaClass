package tw.johnyeh.javaproject.oop.nestedclasses;
class A {
	public String name = "John";
	class B {
		public void play() {
			System.out.println("Play BaseBall  "+name);
		}
	}
	public void processAction () {
		B b1 = new B();
		b1.play();
	}
}
public class TestNestedClassesEX01 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.processAction();

	}

}
