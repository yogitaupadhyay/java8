import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class javaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(new SimpleDateFormat("dd/mm/yyyy").parse("01/01/1950").getTime()); 
			String x = "1521604800000";

					DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

					long milliSeconds= Long.parseLong(x);
					System.out.println(milliSeconds);

					Calendar calendar = Calendar.getInstance();
					calendar.setTimeInMillis(milliSeconds);
					System.out.println(formatter.format(calendar.getTime())); 
		}catch(Exception e) {
			
		}
	}

}
