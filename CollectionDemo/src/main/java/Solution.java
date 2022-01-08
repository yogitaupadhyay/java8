import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		 try {
			 System.out.print(dateFormat.parse(dateFormat.format(new Date())));	
		 }catch(Exception e) {
			 
		 }
	Map<String, String>map=new HashMap<String,String>();
	map.put("1", "one");
	System.out.print(map.get("9"));

	}

}
