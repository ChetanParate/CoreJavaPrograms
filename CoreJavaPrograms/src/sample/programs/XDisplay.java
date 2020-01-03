package sample.programs;

public class XDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printCross(5,'X');

	}
	
	public static void printCross(int size, char dis)
	{
	    for (int row = 0; row < size; row++) {
	        for (int col = 0; col < size; col++) {
	            if (row == col || row + col == size - 1) {
	                System.out.print(dis);
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}

}
