package sample.program.lambdas.two;

public class ThisRefrenceExample {
	
	public void doProcess(int i, Process p){
		p.process(i);
	}
	 public void execute(){
		 
		 doProcess(10, i -> {
				System.out.println("Value of i is " + i);
				System.out.println(this);
			});
		 
	 }
	
	public static void	main(String[] args) {
		ThisRefrenceExample thisRefrenceExample = new ThisRefrenceExample();
		thisRefrenceExample.doProcess(10, i -> {
			System.out.println("Value of i is " + i);
		});
		
		thisRefrenceExample.execute();
	}
	
	public String toString(){
		return "this is the main thisrefrense chetya..";
	}
	
}

