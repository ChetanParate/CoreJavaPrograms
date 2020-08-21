package sample.programs.multithreading;

import java.util.LinkedList;
import java.util.Random;

class LowLevelProcessor{
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			synchronized (lock) {
				while(list.size()==LIMIT) {
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}
	}

	public void consumer() throws InterruptedException {
		while(true) {
			synchronized (lock) {
				while(list.size()==0) {
					lock.wait();
				}
				
				System.out.print("List size is : "+ list.size());
				int value = list.removeFirst();
				System.out.println("; Removed Value is : "+ value);
				lock.notify();
			}
			Thread.sleep(new Random().nextInt(1000));
		}
	}
}

public class LowLevelSyncronization {
	private static LowLevelProcessor processor = new LowLevelProcessor();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				processor.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				processor.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
