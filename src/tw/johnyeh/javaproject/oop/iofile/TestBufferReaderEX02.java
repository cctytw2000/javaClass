package tw.johnyeh.javaproject.oop.iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferReaderEX02 {

	public static void main(String[] args) throws IOException {
//		FileReader fr1 = new FileReader("C:/temp/test/source.txt");
//		BufferedReader bfr = new BufferedReader(fr1);

		BufferedReader bfr = new BufferedReader(new FileReader("C:/temp/test/source.txt"));

//		FileWriter fr = new FileWriter("C:/temp/test/buffersWRite.txt");
//		BufferedWriter  br =new BufferedWriter(fr);
		BufferedWriter br = new BufferedWriter(new FileWriter("C:/temp/test/buffersWRite.txt"));

		String data;
		while ((data = bfr.readLine()) != null) {
			System.out.println(data);
			br.write(data);
			br.newLine();
		}
		br.close();
		bfr.close();
//		fr1.close();
	}

}
