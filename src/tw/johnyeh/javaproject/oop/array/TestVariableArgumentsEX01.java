package tw.johnyeh.javaproject.oop.array;

public class TestVariableArgumentsEX01 {
	public void number(int... x) {
		int total = 0;
		for (int i : x) {
			total = total + i;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		TestVariableArgumentsEX01 answer =new TestVariableArgumentsEX01();
		answer.number();
		answer.number(1,2,3,4,5,6,7,8,9,10);

	}

}
