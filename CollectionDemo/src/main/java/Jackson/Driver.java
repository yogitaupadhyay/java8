package Jackson;

import java.util.Calendar;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.getProperty("frames.useISO8601Serialization");
//		System.getProperty("user");
		Date date=new Date();
		  Calendar cal = Calendar.getInstance();
	        cal.setTime(date);

	        cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0);
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);

	        System.out.println(cal.getTime()); 

	}

}
