package tw.johnyeh.javaproject.oop.collection.generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayListIteratorEX01 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		fruit.add("Momo");
		fruit.add("PineApple");

		ListIterator<String> i1 = fruit.listIterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		ListIterator<String> i2 = fruit.listIterator(3);
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
	}

}
