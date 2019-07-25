package tw.johnyeh.javaproject.oop.iofile;

class TestAutoResouceCloseble implements AutoCloseable {
	public void processResouce() {
		System.out.println("Process Resouce.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resouce close.");

	}

}

public class CallTestAutoResouceClosebleEX01 {

	public static void main(String[] args) {

		try (TestAutoResouceCloseble test = new TestAutoResouceCloseble()) {
			test.processResouce();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
