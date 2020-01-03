package sample.programs;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		Test a = new Test();
		a.start();
		synchronized (a) {
		System.out.println("waiting..");
		try{
			a.wait();
		}catch (InterruptedException iEx){}
		System.out.println(a.count);
		}
	}
}
