package tw.johnyeh.javaproject.oop.iofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReaderEX01 {

	public static void main(String[] args) throws IOException {
//		FileReader fr1 = new FileReader("C:/temp/test/source.txt");
//		BufferedReader bfr = new BufferedReader(fr1);

		BufferedReader bfr = new BufferedReader(new FileReader("C:/temp/test/source.txt"));
		String data;
		while ((data = bfr.readLine()) != null) {
			System.out.println(data);
		}
		bfr.close();
//		fr1.close();
	}

}
