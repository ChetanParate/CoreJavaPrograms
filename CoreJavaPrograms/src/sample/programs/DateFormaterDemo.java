package sample.programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormaterDemo { 
	  	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		 Date today, today1;
		    String strDate;
		    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		    String str = new String("Mar.31, 2019");
		    str = str.replace('.', '-');
		    str = str.replace(", ","-");
		    today = new Date(str);
		    strDate = dateFormat.format(today);
		    System.out.println(strDate);
		    today1 = new Date();
		    String pattern = "MM-dd-yyyy";
		    SimpleDateFormat toDateFormat = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
		    SimpleDateFormat fromDateFormat = new SimpleDateFormat("MMddyyyy", Locale.US);   
		    try{
		    System.out.println(toDateFormat.format(fromDateFormat.parse(new String("11122018"))));
		    }catch (Exception e) {
				// TODO: handle exception
			}
		    
		   
	}
	
} 

