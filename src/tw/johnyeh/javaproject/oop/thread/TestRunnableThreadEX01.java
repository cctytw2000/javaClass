package tw.johnyeh.javaproject.oop.thread;

class RunnableThreadEX implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "  i=" + i);
			if (i < 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

public class TestRunnableThreadEX01 {

	public static void main(String[] args) {
		RunnableThreadEX ex01 = new RunnableThreadEX();
		Thread th1 = new Thread(ex01);
		Thread th2 = new Thread(ex01);
		th1.start();
		th2.start();
		try {
			th2.join();
			System.out.println("Finished");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
