package sample.programs.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connection{
	
	private static Connection instance = new Connection();
	private int connections = 0;	
	private Semaphore semaphore = new Semaphore(10, true);
	private Connection() {
	}
	
	public static Connection getInstance() {
		return instance;
	}
	
	public void connect() {
		
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			doConnect();
		}finally {
			semaphore.release();
		}
	}
	public void doConnect() {
		
		
		synchronized (this) {
			connections++;
			System.out.println("Current connecrtions: "+ connections);
		}
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			connections--;
		}
	}
}

public class SemaphoresApp {

	public static void main(String[] args) throws InterruptedException {
		//Connection.getInstance().connect();
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i = 0; i<200; i++) {
			executor.submit(() ->{
				Connection.getInstance().connect();
			});
		}
		executor.shutdown();
		executor.awaitTermination(1,TimeUnit.DAYS);
		
	}

}
