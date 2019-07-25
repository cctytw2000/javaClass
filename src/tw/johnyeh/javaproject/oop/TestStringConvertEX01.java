package tw.johnyeh.javaproject.oop;

public class TestStringConvertEX01 {

	public static void main(String[] args) {
		String math = "2";
		Integer answer = Integer.parseInt(math);
		System.out.println(answer+1);
		
		
		
		
		
		
		String data = "12345";
		Integer data1 = Integer.parseInt(data);
		System.out.println("data+1:" + (data1+1));
		
		int value1 = Integer.parseInt(data);
		System.out.println("value1+1:" + (value1+1));
		
		String name = "5528";
		int value2 = Integer.parseInt(name);
		System.out.println("value2+1:" + (value2+1));

	}

}
