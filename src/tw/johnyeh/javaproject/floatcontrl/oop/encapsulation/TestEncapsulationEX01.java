package tw.johnyeh.javaproject.floatcontrl.oop.encapsulation;

class ncapsulationEX01 {
	public int number = 5;
	private int score = 60;

	public void sayHello() {
		System.out.println("Do Something");
	}

	private void sayGoodBye() {
		System.out.println("NO WAY");
	}
}

public class TestEncapsulationEX01 {

	public static void main(String[] args) {
		ncapsulationEX01 answer = new ncapsulationEX01();
		System.out.println(answer.number);
//		System.out.println(answer.score);  //Error
		answer.sayHello();
//		answer.sayGoodBye;  //Error

	}

}
