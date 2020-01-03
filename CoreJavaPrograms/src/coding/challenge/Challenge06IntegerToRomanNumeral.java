package coding.challenge;

public class Challenge06IntegerToRomanNumeral {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRmanNum(1234));
	}
	
	public static String intToRmanNum(int num) {
		
		String[] unit = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] tens = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] hundreds = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] thousands = new String[] {"","M","MM","MMM"};
		
		return 	thousands[(num % 10000)/1000]+
				hundreds[(num % 1000)/100]+
				tens[(num % 100)/10]+
				unit[num % 10];
	}
	

}
