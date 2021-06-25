package sample.programs.multithreading;

public class EvenOddNumberTwoThread {
	
	int count =1;
	static int num = 10;
	
	public void printOddNumber() {
		synchronized (this) {
			while(count<num) {
				while(count%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(count+" ");
				count++;
				notify();
			}
		}
	}
	public void printEvenNumber() {
		synchronized (this) {
			while(count<num) {
				while(count%2==1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(count+" ");
				count++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		
		EvenOddNumberTwoThread evenOddThread = new EvenOddNumberTwoThread();
		
		Thread oddNum = new Thread(()-> evenOddThread.printOddNumber());
		Thread evenNum = new Thread(()-> evenOddThread.printEvenNumber());
		oddNum.start();
		evenNum.start();	

	}

}
