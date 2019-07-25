package tw.johnyeh.javaproject.HomeWork;

class Fibonacci_numbers {
	public long Fibonacci(int x) {
		if (x -1 == 0 || x -1 ==1 ) {
			return x -1 ;
		}else {
			return Fibonacci(x-1) + Fibonacci(x-2);
		}
	
	}
}
public class HW0702{


	public static void main(String[] args) {
		for (int n =1 ; n<=48 ;n++) {
			Fibonacci_numbers b = new Fibonacci_numbers();
			long Answer = b.Fibonacci(n);
			System.out.println("n= "+n+" Answer= "+Answer);
		}

	}

}
