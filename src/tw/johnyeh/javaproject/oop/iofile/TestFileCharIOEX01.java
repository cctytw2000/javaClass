package tw.johnyeh.javaproject.oop.iofile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharIOEX01 {

	public static void main(String[] args) throws IOException {
		FileReader filereader = new FileReader("C:/temp/test/source.txt");
		FileWriter fileWriter = new FileWriter("C:/temp/test/FileWriter.txt");
		int data;

		while ((data = filereader.read()) != -1) {
			System.out.print((char) data);
			fileWriter.write(data);
		}
		fileWriter.close();
		filereader.close();
	}

}
