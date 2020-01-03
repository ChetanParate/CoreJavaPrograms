package sample.program.lambdas.one;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		
		StringLengthLambda strLambda = s->s.length();
		System.out.println(strLambda.getLength("Hey chetya hows it"));
		printLambda(s->s.length());
	}
	public static void printLambda(StringLengthLambda lambda){
		System.out.println(lambda.getLength("Hello chetan"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
