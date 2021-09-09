package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//way 1
		Pattern pattern=Pattern.compile(".s");
		Matcher matcher=pattern.matcher("as");
		System.out.println(matcher.matches());

		//way2-
		System.out.println(Pattern.compile("hello.").matcher("hellod").matches());

		//way3-static boolean matches(String regex, CharSequence input)-pattern class
		System.out.println(Pattern.matches("h.", "hi"));
		String h="heloe dear";
		String k=h.substring(3,5);
		
				
	}

}
