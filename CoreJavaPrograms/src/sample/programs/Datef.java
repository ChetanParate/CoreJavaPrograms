package sample.programs;
import java.text.DateFormat;
import java.util.Date;
public class Datef {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		    Date today;
		    String strDate;
		    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		    String str = new String("Mar.31, 2019");
		    str = str.replace('.', '-');
		    str = str.replace(", ","-");
		    today = new Date(str);
		    strDate = dateFormat.format(today);
		    System.out.println(strDate);
		    
		    //SimpleDateFormat formatter =new SimpleDateFormat("MM/dd/yy");
	        //Date convertedDate= null;
			//try {
			//	convertedDate = (Date) formatter.parse(today.toString());
			//} catch (ParseException e) {
			//	// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
	}
}
