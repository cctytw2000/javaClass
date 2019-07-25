package tw.johnyeh.javaproject.oop.iofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestByteConvertStreamIOEX01 {

	public static void main(String[] args) throws IOException {
//		InputStream is1 = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader bfr1 = new BufferedReader(isr1);
		
		System.out.println("Please Input Your Name:(use Q or q to exit)");
		BufferedReader bfr1 = new BufferedReader(new InputStreamReader(System.in));

		String data;
		while ((data = bfr1.readLine()) != null) {
			if ("Q".equalsIgnoreCase(data)) {
				System.out.println("System exit.");
				break;
			}
			System.out.println(data);

		}
		bfr1.close();
	}

}
