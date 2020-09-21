package coding.challenge;

public class Challenge12CamelCaseStringToSnakeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "macOS"; 
	     System.out.println(camelToSnakeOne(str)); 
	     System.out.println(camelToSnakeTwo(str)); 

	}

	public static String camelToSnakeOne(String str) {
		
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
		str = str.replaceAll(regex, replacement).toLowerCase();
		return str;
	}

	public static String camelToSnakeTwo(String str) {

		String result = "";
		char c = str.charAt(0);
		result = result + Character.toLowerCase(c);

		for (int i = 1; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				result = result + '_';
				result = result + Character.toLowerCase(ch);
			}
			else {
				result = result + ch;
			}
		}
		return result;
	}

}
