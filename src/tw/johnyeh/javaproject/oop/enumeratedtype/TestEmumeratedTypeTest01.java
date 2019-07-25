package tw.johnyeh.javaproject.oop.enumeratedtype;

enum Poker {
	spade, heart("john"), diamond, clud;
	private String name = "mary";

	private Poker() {
		System.out.println(name);
	}

	Poker(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("name = " + name);
	}
}

public class TestEmumeratedTypeTest01 {

	public static void main(String[] args) {
		Poker suit = Poker.spade;

		switch (suit) {
		case spade:
			System.out.println(Poker.spade);
			break;
		case heart:
			System.out.println(Poker.heart);
			break;
		case diamond:
			System.out.println(Poker.diamond);
			break;
		case clud:
			System.out.println(Poker.clud);
			break;

		default:
			assert false;
		}

		Poker[] mySuits = Poker.values();
		for (Poker name : mySuits) {
			System.out.println(name + "=" + name.ordinal());
			name.showName();
		}

	}

}
