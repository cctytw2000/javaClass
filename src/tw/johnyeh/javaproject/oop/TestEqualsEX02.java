package tw.johnyeh.javaproject.oop;

public class TestEqualsEX02 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		String str3 = new String("Hello");

		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2));
		System.out.println(str3.equalsIgnoreCase(str2));

		String str4 = "hello";

		System.out.println(str4 == str1);
		System.out.println(str4.equals(str1));

	}

}
