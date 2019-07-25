package tw.johnyeh.javaproject.operator;

public class testoperatorEX1 {

	public static void main(String[] args) {

		
//		int a = 1;
////		a++;
//		++a;
//        System.out.println(a);
        
        
        String a = "new";
        String b = new String("new");
        System.out.println(b.equals(a));
        System.out.println(b==a);
        String c = new String("new");
        String d = new String("new");

        System.out.println(c.equals(d));
        System.out.println(c==d);
        System.out.println(c);
        System.out.println(d);
        

	}

}
