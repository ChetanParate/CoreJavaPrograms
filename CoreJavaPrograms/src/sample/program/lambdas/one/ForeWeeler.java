package sample.program.lambdas.one;

@FunctionalInterface
interface Wheeler {

	public String getName();

	default void print() {
		System.out.println("I am a four wheeler!");
	}

	default void print1() {
		System.out.println("I am a four wheeler 2!");
	}

	default void print3() {
		System.out.println("I am a four wheeler 3!");
	}
	
	static void print4() {
		System.out.println("I am a four wheeler static4!");
	}
	static void print5() {
		System.out.println("I am a four wheeler static5!");
	}
}

class ForeWheeler implements Wheeler {

	@Override
	public String getName() {
		
		return "Chetan !";
	}
	
	public static void main(String[] arg) {
		
		Wheeler fore = new ForeWheeler();
		System.out.println(fore.getName());
		
		fore.print();
		fore.print1();
		fore.print3();
		Wheeler.print4();
		Wheeler.print5();
	}
	}
