package tw.johnyeh.javaproject.HomeWork;

public class HWSELF0701 {

	public static void main(String[] args) {
		int x = 1;
		for(int i = 0 ; i<=2 ;i++) {
			for ( int j = i ; j<=3 ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<=x;k++) {
				System.out.print("*");
			}
			x = x+2;
			System.out.println();
			}
		x  = 3 ;
		for (int i = 0 ; i<=2 ; i++) {
			for (int j = i ; j <=2*i+2 ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<=x ; k++) {
				System.out.print("*");
				}
			System.out.println();
			x = x - 2 ;
			}
		
	}

}
