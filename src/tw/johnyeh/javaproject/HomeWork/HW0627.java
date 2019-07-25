package tw.johnyeh.javaproject.HomeWork;

public class HW0627 {

	public static void main(String[] args) {
		int degree = 32;
		int index =1;
		if (index ==1 ) {
			double degreeF =  degree * 1.8 + 32 ;
			System.out.println("degreeF=" + degreeF );
		} else if (index ==2 ){
			double degreeC =  (degree - 32) / 1.8 ;
			System.out.println("degreeC=" + degreeC );
		}else {
			System.out.println("Invaild Month. Please Try Agin");
		}

	}

}
