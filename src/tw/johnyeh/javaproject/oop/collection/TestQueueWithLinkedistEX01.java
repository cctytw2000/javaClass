package tw.johnyeh.javaproject.oop.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueWithLinkedistEX01 {
	private Queue queue;

	public void executeStoreQueue() {
		queue = new LinkedList();
		queue.offer("john");
		queue.offer("Tony");
	}

	public void executeRetrieveQueue() {
		while (queue.peek() != null) {
			String data = (String) (queue.poll());
			System.out.println("data=" + data);
		}
	}

	public static void main(String[] args) {
		TestQueueWithLinkedistEX01 test = new TestQueueWithLinkedistEX01();
		test.executeStoreQueue();
		test.executeRetrieveQueue();

	}

}
