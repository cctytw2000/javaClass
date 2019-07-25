package tw.johnyeh.javaproject.oop.inheritance;

class Animal {
	public void eat() {
		System.out.println("ead food.");
	}
}

class Lion extends Animal {
	@Override
	public void eat() {
		System.out.println("ead meet.");
	}
	public void bite() {
		System.out.println("bite hourse.");
	}
}

public class TestOverrideEX01 {

	public static void main(String[] args) {
		Lion lionKing = new Lion();
		lionKing.bite();
		lionKing.eat();
	}
}
