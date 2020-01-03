package sample.programs;

public class DemoClass {
		//public static void foo(Integer i) { System.out.println("foo(Integer)"); }
		//public static void foo(short i) { System.out.println("foo(short)"); }
		//public static void foo(long i)  { System.out.println("foo(long)"); }
		//public static void foo(int... i) { System.out.println("foo(int ...)"); }
		
		public static void sum(Integer a, Long i) { System.out.println("Int + Log"); }
		public static void sum(Long b, Integer a) { System.out.println("Lon + Int"); }
		
		public static void main(String []args) {
			
		//foo(new Integer(10));
			sum(new Long(10),new Integer(20));
			
		}
	}
