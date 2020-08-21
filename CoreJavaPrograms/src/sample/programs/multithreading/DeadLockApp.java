package sample.programs.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
	private int balance = 10000;

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}
}

/*
 * ProcessorRunnerClass
 */
class ProcessorRunnerClass {
	private Account acc1 = new Account();
	private Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException{
		while(true) {
			//acquire lock
			
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;
			try {
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();			
			}finally {
				if(gotFirstLock && gotSecondLock) {
					return;
				}
				if(gotFirstLock) {
					firstLock.unlock();
				}
				if(gotSecondLock) {
					secondLock.unlock();
				}
			}
			
			//Lock not acquire
			Thread.sleep(1);
		}
	}

	public void firstThread() throws InterruptedException {
		Random random = new Random();
		for (int i = 10; i < 1000; i++) {
			acquireLocks(lock1,lock2);

			try {
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThread() throws InterruptedException {
		Random random = new Random();
		for (int i = 10; i < 1000; i++) {
			acquireLocks(lock2,lock1);

			try {
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account 1 balance: " + acc1.getBalance());
		System.out.println("Account 2 balance: " + acc2.getBalance());
		System.out.println("Total balance: " + (acc1.getBalance() + acc2.getBalance()));

	}

}

public class DeadLockApp {

	private static ProcessorRunnerClass processorrunnerClass = new ProcessorRunnerClass();

	public static void main(String[] arg) {
		Thread t1 = new Thread(() -> {
			try {
				processorrunnerClass.firstThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				processorrunnerClass.secondThread();
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
		processorrunnerClass.finished();
	}

}
