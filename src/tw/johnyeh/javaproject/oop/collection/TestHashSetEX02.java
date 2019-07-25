package tw.johnyeh.javaproject.oop.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TestHashSetEX02 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet luckyNum = new HashSet();
		while (luckyNum.size() < 6) {
			int lotteryNumber = (int) (Math.random() * 42 + 1);
			luckyNum.add(lotteryNumber);
		}
		System.out.println(luckyNum);

		TreeSet myTreeSet = new TreeSet(luckyNum);
		System.out.println(myTreeSet);
	}
}
