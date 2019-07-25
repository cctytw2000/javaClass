package tw.johnyeh.javaproject.oop.exception;

class DataIsEven extends Exception {

	private static final long serialVersionUID = 1L;
	private String server = "SkyBlue";
	private int port = 3308;
	private String msg = "Method POST";

	public DataIsEven(String server, int port, String msg) {
		this.server = server;
		this.port = port;
		this.msg = msg;
	}

	public void processInfo() {
		System.out.println("server = " + server);
		System.out.println("port = " + port);
		System.out.println("msg = " + msg);
	}
}

public class TestMyOwnException01 {

	public static void main(String[] args) {
		int data = 006;
		if (data % 2 == 0) {
			try {
				throw new DataIsEven("Server", 80, "data Error");
			} catch (DataIsEven e) {
				System.out.println("Exception : " + e);
				e.processInfo();
			}

		} else {
			System.out.println("System Operate Normal.");
		}

	}

}
