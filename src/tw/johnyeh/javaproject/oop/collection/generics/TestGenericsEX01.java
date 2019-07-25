package tw.johnyeh.javaproject.oop.collection.generics;

class TestGenerics<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class TestGenericsEX01 {

	public static void main(String[] args) {
		TestGenerics<String> name = new TestGenerics<String>();
		name.setT("John");
		String myName = name.getT();
		System.out.println("my Name's " + myName);
		
		
		TestGenerics<Integer> num = new TestGenerics<Integer>();
		num.setT(5);
		int answer = num.getT();
		System.out.println("answer+1="+(answer+1));
		

	}

}
