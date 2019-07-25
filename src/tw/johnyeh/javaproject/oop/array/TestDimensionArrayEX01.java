package tw.johnyeh.javaproject.oop.array;

public class TestDimensionArrayEX01 {

	public static void main(String[] args) {
		int[] data = new int[3];
		data[0] = 1;
		data[1] = 2;
		data[2] = 3;
		
		for (int i : data) {
			System.out.println(i);
		}
		
		for (int i = 0; i<3 ;i++) {
			System.out.printf("Data %d = %d\n",i , data[i]);
		}


	}

}
