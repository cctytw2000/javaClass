package tw.johnyeh.javaproject.oop.thread;

class Maze {
	private int x = 0, y = 0;
	private int count = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			this.count++;
			System.out.println("x:" + x + " y:" + y + " count=" + count);
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();

				if (x == 0 && y == 0) {
					System.out.println("i am servived");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Hero implements Runnable {
	private Maze core;

	public Hero(Maze core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep((int) (Math.random() * 500) + 500);
				int x = (int) (Math.random() * 5);
				int y = (int) (Math.random() * 5);
				core.move(x, y);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class checkHero implements Runnable {
	private Maze core;

	public checkHero(Maze core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			try {
				core.checkExit();
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}

	}
}

public class MazeGame {

	public static void main(String[] args) {
		Maze core = new Maze();

		Hero poseidon = new Hero(core);
		Thread ThreadA = new Thread(poseidon);
		ThreadA.start();

		checkHero check = new checkHero(core);
		Thread ThreadB = new Thread(check);
		ThreadB.start();

	}

}
