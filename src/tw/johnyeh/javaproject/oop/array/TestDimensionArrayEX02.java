package tw.johnyeh.javaproject.oop.array;

public class TestDimensionArrayEX02 {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8};
		for(int i = 0 ; i<data.length ; i++) {
			System.out.printf("data[%d]=%d\n",i,data[i]);
		}
		
		
		
		int[] data1 = new int[8];
		
		for (int i = 0 ;i<data1.length ; i++) {
			data1[i] = i+1 ;
		}
		for (int i = 0 ;i<data1.length ; i++) {
			System.out.printf("data1[%d]=%d\n",i,data[i]);
		}
		
	}

}
