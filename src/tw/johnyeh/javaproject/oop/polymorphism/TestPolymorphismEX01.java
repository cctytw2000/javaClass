package tw.johnyeh.javaproject.oop.polymorphism;

class Mammal {
	public void happy() {
		System.out.println("mammal happy");
	}

	public static void ProcessAction(Mammal m) {
		m.happy();
		if (m instanceof Cat) {
			Cat c1 = (Cat)m;
			c1.jumpAway();
		}
		if (m instanceof Dog) {
			Dog d1 = (Dog)m;
			d1.biteBone();
		}
	}
}

class Dog extends Mammal {
	@Override
	public void happy() {
		System.out.println("Wang Wang !!");
	}
	public void biteBone() {
		System.out.println("Dog Bite Bone");
	}
}

class Cat extends Mammal {

	@Override
	public void happy() {
		System.out.println("Mouw Mouw !!");
	}
	public void jumpAway() {
		System.out.println("Cat Jump Away");
	}
}

public class TestPolymorphismEX01 {

	public static void main(String[] args) {
//		Mammal m = new Mammal ();
//		Dog dog = new Dog ();
//		m = dog ;

//		Mammal m2 = new Dog();
//		m2.happy();
//		Mammal m1 = new Cat();
//		m1.happy();
//
//		Mammal m;
//		m = new Dog();
//		m.happy();
//		m = new Cat();
//		m.happy();
		Cat ming = new Cat();
		Mammal.ProcessAction(ming);
		Mammal.ProcessAction(new Dog());

	}

}
