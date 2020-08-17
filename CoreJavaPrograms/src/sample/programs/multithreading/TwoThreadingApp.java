package sample.programs.multithreading;

import java.util.Scanner;

class Processor extends Thread{

	private volatile boolean running = true;
	
	@Override
	public void run() {
	
		while(running) {
			System.out.println("Helloz  Chet ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shoutdown() {
		running = false;
	}
	
	
}
public class TwoThreadingApp {

	public static void main(String[] args) {
		Processor pro = new Processor();
		pro.start();
		
		System.out.println("Please Enter to stop this ....");
		Scanner scan = new Scanner (System.in);
		scan.nextLine();
		
		pro.shoutdown();
		

	}

}
