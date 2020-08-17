package sample.programs.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Process implements Runnable{

	private int id ;
	
	public Process(int id) {
		this.id = id;
	}
	@Override
	public void run() {
			System.out.println("Starting : "+ id);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Completed : "+ id);
	}
	
}

public class ThreadPoolApp {

	public static void main(String[] args) {

		ExecutorService exrcutor = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<5;i++) {
			exrcutor.submit(new Process(i));
		}
		
		exrcutor.shutdown();
		
		System.out.println("All task Submitted.");
		
		try {
			exrcutor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
		}
		System.out.println("All task Completed.");
		

	}

}
