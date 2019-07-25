package tw.johnyeh.javaproject.oop.iofile;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileByteStreamIOEX01 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1 = new FileInputStream("c:/temp/test/source.txt");

		int data;

		while ((data = file1.read()) != -1) {

			System.out.print((char) data + "");
		}
		file1.close();
	}

}
