package tw.johnyeh.javaproject.oop;

class Shirt {
	int price = 2000;
	char size = 'L';
}

public class TestReference {

	public static void main(String[] args) {
		Shirt myShirt = new Shirt();
		Shirt yourShirt = new Shirt();
		Shirt shirt = new Shirt();
		myShirt.price = 3000;
		myShirt.size = 'M';
		
		
		
		yourShirt.price = 5000;
		yourShirt.size = 'S';

		System.out.println(myShirt);
		System.out.println(yourShirt);
		
		
		System.out.println("myShirt.price:" + myShirt.price);
		System.out.println("myShirt.size:" + myShirt.size);

		System.out.println("yourShirt.price:" + yourShirt.price);
		System.out.println("yourShirt.size:" + yourShirt.size);
		
//		System.out.println("shirt.price:" + shirt.price);
//		System.out.println("shirt.size:" + shirt.size);
		
		yourShirt = myShirt;
		
		yourShirt.price = 10000;
		yourShirt.size = 'x';

		System.out.println(myShirt);
		System.out.println(yourShirt);
		
		System.out.println("myShirt.price_1:" + myShirt.price);
		System.out.println("myShirt.size_1:" + myShirt.size);

		System.out.println("yourShirt.price_1:" + yourShirt.price);
		System.out.println("yourShirt.size_1:" + yourShirt.size);
	}
}
