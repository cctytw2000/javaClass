package tw.johnyeh.javaproject.operator;

public class testoperatorEX2 {

	public static void main(String[] args) {
		int i = 1 , j , j2;
		j = i++;
		System.out.println("i="+i);
		System.out.println("j="+j);
		i = 1 ;
		j2 = ++i ; 
		
		System.out.print('\n');
		System.out.println("i="+i);
		System.out.println("j="+j2);
		
		int a = 1 ;
		a = a++;
		System.out.println("a="+a);

	}

}
