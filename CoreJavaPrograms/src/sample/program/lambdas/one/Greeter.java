 package sample.program.lambdas.one;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
			
		Greeting lambdaGreeting = ()-> System.out.println("Hello chetan..");
		greeter.greet(lambdaGreeting);		
		Greeting greet = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hei chetya");
			}
		};
		greeter.greet(greet);
	}
}
