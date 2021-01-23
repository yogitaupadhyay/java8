package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	// word boundaries and matcher class methods
	public static void main(String[] args) {

		// find()
		Pattern p = Pattern.compile("\\bcat\\b");
		Matcher m = p.matcher("pushy cat pusy cat where have you been what did you do there ,pusy cat pusy cat");
		while (m.find()) {
			System.out.println("start= " + m.start() + "end =" + m.end());
		}

		// looking at
		System.out.println("looking at m ="+ m.lookingAt());
		
		Pattern p1 = Pattern.compile("foo");
		Matcher m1 = p1.matcher("fooooooooooooooo");
		System.out.println("matches m1 = "+m1.matches());
		System.out.println("looking at m1= "+m1.lookingAt());
		
		Pattern p2 = Pattern.compile("foo");
		Matcher m2 = p2.matcher("foo");
		System.out.println("mathces m2 = "+m2.matches());
		System.out.println("looking at m2 = "+m2.lookingAt());
		
		//replaces
		System.out.println("replace all m= "+m.replaceAll("dog"));
		System.out.println("replace first m= "+m.replaceFirst("dog"));
		
		
		
		
		

	}

}
