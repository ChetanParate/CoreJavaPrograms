package sample.program.lambdas.one;

public class RunableLambdaExample {

	public static void main(String[] args) {
		//Anonymous inner class
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");	
			}
		});
		
		myThread.start();
		
		//lambda expression
		Thread myLambdaThread = new Thread(()->System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.start();

	}

}
