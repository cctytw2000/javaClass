package tw.johnyeh.javaproject.oop.polymorphism;

class Employee {
	public void ToDo() {
		System.out.println("TO DO Have To DO");
	}

	public static void proessesAction(Employee e) {
		if (e instanceof Engineer) {
			Engineer a = (Engineer) e;
			a.makeCode();
		}
		if (e instanceof Manager) {
			Manager a = (Manager) e;
			a.justSay();
		}
		if (e instanceof Sales) {
			Sales a = (Sales) e;
			a.workOutSide();
		}
	}
}

class Engineer extends Employee {
	@Override
	public void ToDo() {
		System.out.println("To Do Employee Work");
	}

	public void makeCode() {
		System.out.println("Make Code");
	}
}

class Manager extends Employee {
	@Override
	public void ToDo() {
		System.out.println("To Do Employee Work");
	}

	public void justSay() {
		System.out.println("Just Say");
	}
}

class Sales extends Employee {

	@Override
	public void ToDo() {
		System.out.println("Sales Some Thing");
	}

	public void workOutSide() {
		System.out.println("Work Out Side");
	}

}

public class TestPolymorphismEX02 {

	public static void main(String[] args) {
		Sales kuanlin = new Sales();
		kuanlin.ToDo();
		Employee.proessesAction(kuanlin);

	}

}
