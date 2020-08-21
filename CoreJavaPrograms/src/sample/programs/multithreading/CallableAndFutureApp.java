package sample.programs.multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableAndFutureApp {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int duration = new Random().nextInt(4000);
				
				if(duration>2000) {
					throw new IOException("Sleeping for too long...");
				}
				
				System.out.println("Starting....");
				try {
				Thread.sleep(duration);
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				
				System.out.println("Finished.");
				return duration;
			}			
		});

		executor.shutdown();
		//executor.awaitTermination(1, TimeUnit.DAYS);

		try {
			System.out.println("Result is:"+future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
