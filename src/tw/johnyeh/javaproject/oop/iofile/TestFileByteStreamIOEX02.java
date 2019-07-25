package tw.johnyeh.javaproject.oop.iofile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestFileByteStreamIOEX02 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1 = new FileInputStream("c:/temp/test/source.txt");
		FileOutputStream fileCopy=new FileOutputStream ("c:/temp/test/FileOutputStream.txt");
		int data;

		while ((data = file1.read()) != -1) {
			System.out.print((char) data + "");
			fileCopy.write(data);
		}
		fileCopy.close();
		file1.close();
	}

}
