package tw.johnyeh.javaproject.oop.collection;

import java.util.HashSet;

public class TestHashSetEX01 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("John");
		set1.add("mary");
		set1.add(new String("mary"));
		set1.add(5);
		set1.add(new Integer(5));
		set1.add(3.1415926);
		System.out.println(set1.size());
		System.out.println(set1);
		
		set1.remove("mary");
		System.out.println(set1.size());
		System.out.println(set1);

	}

}
