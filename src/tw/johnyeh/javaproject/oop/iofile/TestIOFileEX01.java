package tw.johnyeh.javaproject.oop.iofile;

import java.io.File;
import java.io.IOException;

public class TestIOFileEX01 {

	public static void main(String[] args) throws IOException {
		File filePath = new File("C:\\temp\\test\\hello.txt");
		File Path = new File("C:/temp/test");
		boolean PathisTrue = Path.exists();

		System.out.println(Path.exists());
		if (PathisTrue) {
			boolean isTrue = filePath.exists();
			if (isTrue) {
				System.out.println("file name" + filePath.getName());
				System.out.println("file length" + filePath.length());
				System.out.println("file Parent" + filePath.getParent());
				System.out.println("file Path" + filePath.getPath());
				filePath.delete();
				System.out.println("File Deleted");
			} else {
				filePath.createNewFile();
				System.out.println("File Create");
			}

		} else {
			Path.mkdir();
			System.out.println("資料夾建立 ");
		}

	}

}
