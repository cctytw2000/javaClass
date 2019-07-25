package tw.johnyeh.javaproject.oop.method;


class MyMathComputer {
	public int  f(int x) {
		return 2*x+1 ; //Worker
	}
}


public class TestOOPMethodEX03 {

	public static void main(String[] args) {
		MyMathComputer MarhFX = new MyMathComputer() ;
		int Anser = MarhFX.f(5);  //Caller
		System.out.println(Anser);

	}

}
