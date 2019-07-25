package tw.johnyeh.javaproject.oop.iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteConvertStreamIOEX02 {

	public static void main(String[] args) throws IOException {
//		InputStream is1 = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader bfr1 = new BufferedReader(isr1);

		System.out.println("Please Input Your Name:(use Q or q to exit)");
		BufferedReader bfr1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfwr = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("C:/temp/test/WhatAreYouDing.txt")));
		String data;
		while ((data = bfr1.readLine()) != null) {
			if ("Q".equalsIgnoreCase(data)) {
				System.out.println("System exit.");
				break;
			}
			bfwr.write(data);
			bfwr.newLine();
			System.out.println(data);
		}
		bfwr.flush();
		bfwr.close();
		bfr1.close();
	}

}
