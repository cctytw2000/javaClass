package tw.johnyeh.javaproject.oop;

public class TestThisEX01 {
	int x = 1;
	int y = 2;
	public TestThisEX01() {
		this(3);
		System.out.println("TestThisEX01 ()");
	}

	public TestThisEX01(int level) {
		System.out.println("TestThisEX01 (int level):" + level);

	}

	public void changeValue(int x, int y) {
		System.out.println("this.x: " + this.x);
		System.out.println("this.y: " + this.y);
		this.x = x;
		this.y = y;
		System.out.println("this.x: " + this.x);
		System.out.println("this.y: " + this.y);

//		System.out.println(this);
	}

	public static void main(String[] args) {
		TestThisEX01 test1 = new TestThisEX01();
		test1.changeValue(3, 5);
//		System.out.println(test1);

		System.out.println("test1.x: " + test1.x);
		System.out.println("test1.y: " + test1.y);
		

		TestThisEX01 test2 = new TestThisEX01(5);
		
		
		
		
	}

}
