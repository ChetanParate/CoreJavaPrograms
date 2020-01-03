package sample.program.lambdas.two;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5};
		int key = 0;
		
//		String url ="https://m.kmart.com/ccil/api/cart/v1/view";
//		if(url.indexOf("/ccil/api/cart/") != -1 ||url.indexOf("/crsp/mx/cart") != -1 ){
//			System.out.println(true);
//		}else{
//			System.out.println(false);
//		}
		
				
		process(num, key,wrapperLambda((v,k)->System.out.println(v/k)));

	}

	private static void process(int[] num, int key, BiConsumer<Integer, Integer> consumer) {
		for(int v :num){
			consumer.accept(v, key);
		}
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (v,k)->{
			try{
				consumer.accept(v, k);
			}catch (ArithmeticException e) {
				System.out.println("Exception cought in wrapper Lambda..");
			}
			
		};
	}

}
