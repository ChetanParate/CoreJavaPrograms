package sample.programs.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*************************************
** Thread by Extending Tread class ***
**************************************/
class Runner extends Thread{

	@Override
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println("HelloW chet :"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
/***********************************************
** Thread by implementing Runnable Interface ***
***********************************************/
class RunnerTwo implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println("HelloW chet :"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingApp {

	public static void main(String[] args) {
	Runner runnerOne = new Runner();
	runnerOne.start();
	Runner runnerTwo = new Runner();
	runnerTwo.start();
	
	/*********************************************
	** Thread by anonymous Runnable Interface ***
	*********************************************/
	Thread runnerTree = new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i = 0; i <10; i++) {
				System.out.println("HelloW chet :"+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	runnerTree.start();
	
	/*****************************************
	*** Thread by anonymous Thread class ****
	*****************************************/
	Thread runnerFore = new Thread() {
		@Override
		public void run() {
			for(int i = 0; i <10; i++) {
				System.out.println("HelloW chet :"+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	runnerFore.start();
	
	/****************************
	*** Thread by using Java8 ***
	*****************************/
	Thread runnerFive = new Thread(()-> {
		for(int i = 0; i <10; i++) {
			System.out.println("HelloW chet :"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	runnerFive.start();
	
	/*************************************************
	 * Thread By executor services Concurrency API ***
	 ************************************************/
	ExecutorService executor = Executors.newSingleThreadExecutor();
	executor.submit(() -> {
	    String threadName = Thread.currentThread().getName();
	    System.out.println("Hello " + threadName);
	});
	
	}

}
