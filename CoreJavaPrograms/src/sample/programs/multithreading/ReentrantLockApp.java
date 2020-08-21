package sample.programs.multithreading;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ProcessorRunner {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	private void increment() {
		for(int i = 0;i<1000;i++) {
			count++;
		}
	}
	
	public void firstThread() throws InterruptedException{
		lock.lock();
		System.out.println("Waiting.....");
		cond.await();
		System.out.println("Woken up!");
		try {
			increment();	
		}finally {
			lock.unlock();	
		}
	}
	public void secondThread() throws InterruptedException{
		
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press Enter Key !...");
		new Scanner(System.in).nextLine();
		System.out.println("Got Enter Key!");
		
		cond.signal();
		try {
			increment();	
		}finally {
			lock.unlock();	
		}
	}
	public void finished() {
		System.out.println("Count is : "+count);
		
	}
	
}

public class ReentrantLockApp {
	
	private static ProcessorRunner runner = new ProcessorRunner(); 

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				runner.firstThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				runner.secondThread();
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
		runner.finished();

	}

}
