package sample.programs;

public class PrimeNumber {
	
	public static void main(String[] args){
		
		int flag = 0;
		int num = 3;
		int rNum = num/2;
		for(int i = 2;i<=rNum;i++){
			if(num%i==0){
				System.out.println("Number is not Prime");
				flag =1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Number is Prime");
		}
	}

}
