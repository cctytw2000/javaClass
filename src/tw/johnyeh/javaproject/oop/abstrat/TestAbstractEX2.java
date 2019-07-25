package tw.johnyeh.javaproject.oop.abstrat;

interface Flyer {
	public void takeOff();

	public void Fly();

	public void Land();
}

abstract class Creature {
	abstract public void eat();
}

class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane takeOff");

	}

	@Override
	public void Fly() {
		System.out.println("Airplane Fly");

	}

	@Override
	public void Land() {
		System.out.println("Airplane Land");

	}

}

class Eagle extends Creature implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

}

class Bird extends Creature implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird takeOff");

	}

	@Override
	public void Fly() {
		System.out.println("Bird Fly");

	}

	@Override
	public void Land() {
		System.out.println("Bird Land");

	}

	@Override
	public void eat() {
		System.out.println("Bird Eat");

	}

}

public class TestAbstractEX2 {
	public static void ATC(Flyer f) {

		f.takeOff();
		f.Fly();
		f.Land();
		if (f instanceof Bird) {
			Bird b = (Bird) f;
			b.eat();
		}

	}

	public static void main(String[] args) {
		TestAbstractEX2.ATC(new Bird());
		TestAbstractEX2.ATC(new Airplane());
	}

}