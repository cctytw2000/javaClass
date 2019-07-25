package tw.johnyeh.javaproject.oop;

public class TestNumberSortEX01 {

	int[] data = { 5, 12, 7, 26, 9 };
	int temp = 0;

	public void dataSort1() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] < data[j]) {
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;

				}
			}
		}
	}

	public void dataSort2() {
		while (true) {
			int count = 0;
			for (int i = 0; i < data.length - 1; i++) {
				int temp = 0;
				if (data[i] < data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
	}

	public void printData() {
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%d\n", data[i]);
		}
	}

	public void Rank2() {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			count = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[i] <= data[j]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.printf("%d    Rank2 == %d\n", count, data[i]);
			}
		}
	}

	public int printRank(int n) {
		int answer = data[n - 1];
		return answer;
	}

	public static void main(String[] args) {
		TestNumberSortEX01 answer = new TestNumberSortEX01();
//		answer.dataSort1();

//		answer.dataSort2();
//		answer.printData();
		answer.Rank2();
//		int rank  = 1 ;
//		int rankData = answer.printRank(rank);
//		System.out.printf("Rank%d = %d",rank,rankData);

	}

}
