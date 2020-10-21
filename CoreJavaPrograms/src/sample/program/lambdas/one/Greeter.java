 package sample.program.lambdas.one;

import java.util.HashMap;
import java.util.Map;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
		Map emp = new HashMap<>();
		emp.put("Chetan","Parate");
		emp.put("Ram","Patil");
		emp.put("Sham","Pattel");
		System.out.println(emp);
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
