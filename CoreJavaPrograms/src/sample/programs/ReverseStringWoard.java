package sample.programs;

public class ReverseStringWoard{
	
	public static void main(String[] args){
		
		String str = "Chetan is a good boy";
		String str2 = "";
		if(str != null){
			String[] str1 =str.split(" ");
			for(int i = str1.length-1;i>=0;i--){
				str2 = str2+" "+str1[i];
			}
		}
		System.out.println(str2);
		
		
	}

}
