package tw.johnyeh.javaproject.floatcontrl;

public class TestIfElseIfEx1 {

	public static void main(String[] args) {
		int month =2;
		int year = 2020;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(year+" "+month + "有31天");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(year+" "+month + "月有30天");
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 >= 1 || year % 400 == 0) {
				System.out.println(year+" "+month + "月有29天");
			} else if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
				System.out.println(year+" "+month + "月有28天");
			}

		} else {
			System.out.println("Invaild Month. Please Try Agin");
		}
//		西元年份除以4不可整除，為平年。
//		西元年份除以4可整除，且除以100不可整除，為閏年。
//		西元年份除以100可整除，且除以400不可整除，為平年
//		西元年份除以400可整除，為閏年。
	}

}
