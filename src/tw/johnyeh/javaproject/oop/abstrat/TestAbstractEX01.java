package tw.johnyeh.javaproject.oop.abstrat;

abstract class Company {

	public static void process(Company c) {
		if (c instanceof Truck) {
			Truck t1 = (Truck) c;
			t1.calDistance();
			t1.calFuel();
		}
		if (c instanceof Ship) {
			Ship t1 = (Ship) c;
			t1.calDistance();
			t1.calFuel();
		}
	}
	public static void processAction(Company c) {
		c.calDistance();
		c.calFuel();
	}

	abstract public void calFuel();

	abstract public void calDistance();
}

class Truck extends Company {

	@Override
	public void calFuel() {
		System.out.println("Truck calculates Fuel.");

	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distances.");

	}

}

class Ship extends Company {

	@Override
	public void calFuel() {
		System.out.println("Ship calculates Fuel.");

	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculates Distances.");

	}

}

public class TestAbstractEX01 {

	public static void main(String[] args) {
		Company c1 = new Ship();
//		c1.calFuel();
//		c1.calDistance();
//		Company c2 = new Truck();
//		c2.calFuel();
//		c2.calDistance();

//		Ship s1 = new Ship();
//		Company.process(s1);
//		Company.process(new Truck());

		
		Company.processAction(new Truck());
		Company.processAction(new Ship());
	}

}
