package sample.program.lambdas.two;

public class MethodRefrenceExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(MethodRefrenceExample::doProcess);//()->doProcess();
		thread.start();
		

	}
	
	public static void doProcess(){
		System.out.println("Hello chetya..");
	}

}
