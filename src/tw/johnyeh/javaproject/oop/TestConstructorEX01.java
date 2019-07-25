package tw.johnyeh.javaproject.oop;

public class TestConstructorEX01 {
	public TestConstructorEX01(int value) {
		System.out.println("TestConstructor : " + value);
	}
	public static void main(String[] args) {
		TestConstructorEX01 test = new TestConstructorEX01(5);
		test.play();
		new TestConstructorEX01(6).play();
		new TestConstructorEX01(7).play();
		System.out.println("Finished");
	}
	public void play() {
		System.out.println("Play for Fun");
	}
}
