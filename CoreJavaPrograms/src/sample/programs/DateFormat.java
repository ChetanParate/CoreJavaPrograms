package sample.programs;


public class DateFormat {
	
	public static void main(String []args){
		 try
         {
			 String str1 = "12/31/2018 23:59:59:000";
				if(null != str1 ){
				String[] endDateArray = str1.split(" ");
				if(endDateArray.length>1){
					System.out.println(endDateArray[0]);
				}else{
					System.out.println(str1);
				}
			}
         }
         catch (Exception e)
         {
            System.out.println("Exception occured " +e);
             e.printStackTrace();
         }	
	}
}
