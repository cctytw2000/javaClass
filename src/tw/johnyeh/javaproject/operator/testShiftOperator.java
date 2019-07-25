package tw.johnyeh.javaproject.operator;

public class testShiftOperator {

	public static void main(String[] args) {
		int num1 = 1234,num2 = -1234 ;
		System.out.println(num1 + ">>2" + " "+(num1>>2));
		System.out.println(num2 + ">>2" + " "+(num2>>2));
		System.out.println();
		System.out.println(num1 + "<<2" + " "+(num1<<2));
		System.out.println(num2 + "<<2" +" "+ (num2<<2));
		System.out.println();
		System.out.println(num1 + ">>>2" + " "+(num1>>>2));
		System.out.println(num2 + ">>>2" + " "+(num2>>>2));

	}

}
