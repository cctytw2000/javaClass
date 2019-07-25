package tw.johnyeh.javaproject.oop;
class Motocycle{
	public void SpeedUp () {
		System.out.println("Speed UP !!");
	}
	public static void Brake () {
		System.out.println("Stop The Moto");
	}
}

public class TestStaticEX01 {

	public static void main(String[] args) {
		Motocycle S_Max = new Motocycle();
		S_Max.SpeedUp();
		Motocycle.Brake();

	}

}
