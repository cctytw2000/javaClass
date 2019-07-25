package tw.johnyeh.javaproject.oop.method;

class Person {
	public void sayHello() {
		System.out.println("Hola");
	}

	public void sayGoodBye() {
		System.out.println("Adios");
	}

	public void addAnswer(int x, int y) {
		System.out.printf("%d+%d=%d\n",x,y,x+y);
	}

}

public class TestOOPMethodEX01 {

	public static void main(String[] args) {
		Person John = new Person();
		John.sayHello();
		John.sayGoodBye();
		John.addAnswer(1,3);
		System.out.println("Work Done !!");
	}

}
