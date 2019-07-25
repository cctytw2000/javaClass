package tw.johnyeh.javaproject.oop.array;

public class Tese2ArrayEX01 {

	public static void main(String[] args) {
		int[][] data = {{1,2,3,4,5},{7,8,6,9}};
		for(int i = 0 ;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.printf("data[%d][%d]=%d\n",i,j,data[i][j]);
			}
		}
	}

}
