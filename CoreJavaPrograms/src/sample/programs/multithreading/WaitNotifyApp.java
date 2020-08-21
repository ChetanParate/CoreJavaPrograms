package sample.programs.multithreading;

import java.util.Scanner;

class ProcessorApp{
	
	public void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("Producer thread running....");
			wait();
			System.out.println("Resumed.");	
		}
	}
	
	public void consumer() throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("Waiting for Enter Key....");
			scanner.nextLine();
			System.out.println("Enter Key Pressed.");	
			notify();
			Thread.sleep(5000);
			
		}
	}
	
}

public class WaitNotifyApp {
	final static ProcessorApp processor = new ProcessorApp();

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			try {
				processor.producer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(()-> {
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
