package coding.challenge;

public class Challenge10PowerOfFour {

	// O(log N)
	public static boolean isPowerOfFour(int num) {
		boolean flag = true;
		if (num == 0) {
			flag = false;
		}
		while (num!= 1) {
			if (num%4!=0)flag = false;
			num = num/4;
		}
		return flag;
	}
	//0(n)
	public static boolean isPowerOfFourTwo(int num) {
		return Math.log(num)/Math.log(4)%1==0;
	}

	public static void main(String[] args) {

		if(isPowerOfFourTwo(16)) {
			System.out.println("This is power Of Four");
		}else {
			System.out.println("This is not power Of Four");
		}
	}

}
