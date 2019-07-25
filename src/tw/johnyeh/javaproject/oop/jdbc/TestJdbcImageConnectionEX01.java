package tw.johnyeh.javaproject.oop.jdbc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJdbcImageConnectionEX01 {
	private TestjdbcConnDataSource myconn;
	private Connection conn;

	public TestJdbcImageConnectionEX01() throws SQLException, IOException {
		myconn = new TestjdbcConnDataSource();
		conn = myconn.getConnection();
		boolean status = !conn.isClosed();
		System.out.println("status:" + status);
	}

	public void processImageAction() throws FileNotFoundException, SQLException {
		FileInputStream fis = new FileInputStream(new File("c:/temp/steak.jpg"));
		String sqlcode = "insert into gallery(imageName,ImageFile) values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setString(1, "steak");
		state.setBinaryStream(2, fis);
		state.executeUpdate();
		state.close();
		System.out.println("insert image data success.");
	}

	public void processRetreiveImage() throws SQLException, IOException {
		String sqlcode = "select * from gallery where gallery_id = ?";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setInt(1, 1);
		ResultSet rs = state.executeQuery();
		while (rs.next()) {
			Blob blob = rs.getBlob(3);
			System.out.println("length=" + blob.length());
			BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/mynewimage.jpg"));
			bos1.write(blob.getBytes(1, (int) blob.length()));
			bos1.flush();
			bos1.close();
		}
		rs.close();
		state.close();
		System.out.println("get image done");
	}

	public void processRetreiveImage2() throws SQLException, IOException {
		String sqlcode = "select * from gallery where gallery_id = ?";
		PreparedStatement state = conn.prepareStatement(sqlcode);
		state.setInt(1, 1);
		ResultSet rs = state.executeQuery();
		while (rs.next()) {
			InputStream is1 = rs.getBinaryStream(3);

			BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/mynewimage2.jpg"));
			int data;
			while ((data = is1.read()) != -1) {
				bos1.write(data);
			}

			bos1.flush();
			bos1.close();
			is1.close();
		}
		rs.close();
		state.close();
		System.out.println("get image done");
	}

	public static void main(String[] args) throws SQLException, IOException {
		TestJdbcImageConnectionEX01 imageproc = new TestJdbcImageConnectionEX01();
//		imageproc.processImageAction();
		imageproc.processRetreiveImage();
		imageproc.processRetreiveImage2();
		imageproc.fisclose();

	}

	public void fisclose() throws SQLException {
		myconn.closeConn();
	}

}
