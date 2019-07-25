package tw.johnyeh.javaproject.oop.inheritance;

class parent {
	String name = "Jack";

	public parent() {

	}

	public parent(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("HI!...." + name);
	}
}

class child extends parent {
	public child() {
		super("Tony");
	}

	public void sayNO() {
		System.out.println("NO....");
		super.sayHello();
	}
}

public class TestExtendsEX01 {

	public static void main(String[] args) {
		child person = new child();
		person.name = "John"; 
//		person.sayHello();
		person.sayNO();

	}

}
