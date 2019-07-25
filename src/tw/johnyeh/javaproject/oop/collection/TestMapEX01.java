package tw.johnyeh.javaproject.oop.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMapEX01 {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("1st", "John");
		map1.put("2nd", "Tony");
		map1.put("3rd", "Rich");
		map1.put("3rd", "Mary");
		Set key = map1.keySet();
		Set collect = map1.entrySet();
		Collection values = map1.values();

		String firstOne = (String) map1.get("1st");
		System.out.println("key=" + key);
		System.out.println("values=" + values);
		System.out.println("collect=" + collect);
		System.out.println("firstOne=" + firstOne);
		
		
		
        for (Object key1 : map1.keySet()) {
            System.out.println(key1 + " : " + map1.get(key1));
        }
	}

}
