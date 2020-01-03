package sample.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int a,cal = 0;
		int temp=num;
		while(num>0){
			a =num%10;
			cal=cal+(a*a*a);
			num = num/10;
		}
		if(cal == temp)
			System.out.println("Armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   

	}

}
