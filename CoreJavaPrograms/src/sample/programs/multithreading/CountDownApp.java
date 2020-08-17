package sample.programs.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ProcessorTwo implements Runnable{

	private CountDownLatch latch;
	
	public ProcessorTwo(CountDownLatch latch) {
		this.latch =latch;
	}
	@Override
	public void run() {
		System.out.println("Started..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	}
	
	
}

public class CountDownApp {
	
	public static void main(String[] arg) {
	
		CountDownLatch latch = new CountDownLatch(3);
		 ExecutorService executor = Executors.newFixedThreadPool(3);
		 
		 for(int i=0;i<3;i++) {
			 executor.submit(new ProcessorTwo(latch));
		 }

			 try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 System.out.println("Completed..");
	}

}
