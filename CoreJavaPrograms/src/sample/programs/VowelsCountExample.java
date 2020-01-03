package sample.programs;

import java.util.ArrayList;
import java.util.List;

public class VowelsCountExample {

	public static void main(String[] args) {
		
		String str = "Hello Chetan is a good boy";
		str = str.toLowerCase();
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		char[] charArray = str.toCharArray();
		for(int j = 0; j<=str.length()-1;j++){
			char ch = str.charAt(j);
			if(ch =='a'){
				a++;
			}else if (ch =='e') {
				e++;
			}else if (ch =='i' ) {
				i++;
			}else if (ch =='o') {
				o++;
			}else if (ch =='u') {
				u++;
			}
		}
		
		System.out.println("a count : "+a+"\ne count : "+e+"\ni count : "+i+"\no count : "+o+"\nu count : "+u);	
		List<Character> list = new ArrayList<>();
		for(Character ch : charArray){
			list.add(ch);
		}
		long aCount = list.stream().filter(l->l.toString().equalsIgnoreCase("a")).count();
		long eCount = list.stream().filter(l->l.toString().equalsIgnoreCase("e")).count();
		long iCount = list.stream().filter(l->l.toString().equalsIgnoreCase("i")).count();
		long oCount = list.stream().filter(l->l.toString().equalsIgnoreCase("o")).count();
		long uCount = list.stream().filter(l->l.toString().equalsIgnoreCase("u")).count();
		
		System.out.println(aCount +" "+eCount +" "+iCount +" "+oCount +" "+uCount);
		
		

	}

}
