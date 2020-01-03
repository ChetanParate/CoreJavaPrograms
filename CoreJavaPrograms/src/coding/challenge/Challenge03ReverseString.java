package coding.challenge;

public class Challenge03ReverseString {

	public static void main(String[] args) {
		String str ="Hello chetan";
		System.out.println(reverseStringWithStringBuilder(str));
		System.out.println(reverseManually(str));
	}
	
	private static String reverseStringWithStringBuilder(String str){
		return new StringBuilder(str).reverse().toString();
	}
	
	private static String reverseManually(String str){
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0;i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
