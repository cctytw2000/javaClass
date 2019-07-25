package tw.johnyeh.javaproject.oop.collection;

import java.util.ArrayList;

public class TestArrayListEX01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();

		list1.add("John");
		list1.add("mary");
		list1.add(new String("mary"));
		list1.add(5);
		list1.add(new Integer(5));
		list1.add(3.1415926);
		System.out.println("list1 = " + list1);

		list1.add(2, "Tony");
		System.out.println("new list1 = " + list1);
		String data = (String) list1.get(2);
		System.out.println("data = " + data);
	}

}
