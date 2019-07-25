package tw.johnyeh.javaproject.operator;

public class TestOperationCastEX1 {

	public static void main(String[] args) {
		byte a = 1 , b = 2 ,c;
		c = (byte)(a+b) ; 
		System.out.println(c);


		
		String str = "test";
		String type = str.getClass().getName();
		System.out.println(str.getClass().getName());

	}

}
