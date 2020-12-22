package sample.programs;

interface Conversion{
	
	public int convert();	
}

class InrToDs implements Conversion {

	@Override
	public int convert() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class InrToUr implements Conversion{

	@Override
	public int convert() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class MyFactory{
	
	public Conversion getConverted(String typeConvert) {
		
		if(typeConvert == null) {
			return null;
		}else	if(typeConvert.equalsIgnoreCase("INRTODS")) {
			return new InrToDs();
		}else if(typeConvert.equalsIgnoreCase("INTOUR")) {
			return new InrToUr();
		}
		return null;
	}
	
}


public class Converstion {
	
	public static void main(String[] args) {
		
		MyFactory myFactory = new MyFactory();
		
		Conversion conv = myFactory.getConverted("INRTODS");
		
		conv.convert();
		
	}
	

}
