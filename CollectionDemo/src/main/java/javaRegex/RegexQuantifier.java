package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// *-matches 0 or more character
		System.out.println("+++++++++++++++++++++1++++++++++++++++++++++++");
		Pattern hellop = Pattern.compile("hello*");
		
		Matcher hellom = hellop.matcher("hell");
		System.out.println("hell = "+hellom.matches());
		
		Matcher hellom1 = hellop.matcher("hello");
		System.out.println("hello = "+hellom1.matches());
		
		Matcher hellom2 = hellop.matcher("helloooooooooooooooo");
		System.out.println("helloooooooooooooooo = "+hellom2.matches());
		
		Matcher hellom3= hellop.matcher("hellohellohello");
		System.out.println("hellohellohello = "+hellom3.matches());
		
		System.out.println();
		
		// +  ->matches 1 or more character
		System.out.println("+++++++++++++++++++++2++++++++++++++++++++++++");
		Pattern Phello = Pattern.compile("hello+");
		
		Matcher hellomP = Phello.matcher("hell");
		System.out.println("hell = "+hellomP.matches());
		
		Matcher hellomP1 = Phello.matcher("hello");
		System.out.println("hello = "+hellomP1.matches());
		
		Matcher hellomP2 = Phello.matcher("helloooooooooooooooo");
		System.out.println("helloooooooooooooooo = "+hellomP2.matches());
		
		Matcher hellomP3= Phello.matcher("hellohellohello");
		System.out.println("hellohellohello = "+hellomP3.matches());
		
		System.out.println();
		
		

		// {2}  ->matches only two repetition of the char it is applied to
		System.out.println("+++++++++++++++++++++3++++++++++++++++++++++++");
		Pattern Pjadu = Pattern.compile("jado{2}");
		
		Matcher jadoo = Pjadu.matcher("jadoo");
		System.out.println("jadoo = "+jadoo.matches());
		
		Matcher jadooo = Pjadu.matcher("jadooo");
		System.out.println("jadooo = "+jadooo.matches());
		
		

		// {1,4}  ->matches  1 to 4 repetition of char it is applied to 
		System.out.println("+++++++++++++++++++++3++++++++++++++++++++++++");
		Pattern Pjaduu = Pattern.compile("jadu{1,4}");
		
		Matcher jadu = Pjaduu.matcher("jadu");
		System.out.println("jadu = "+jadu.matches());
		
		Matcher jaduu = Pjaduu.matcher("jaduu");
		System.out.println("jaduu = "+jaduu.matches());
		
		Matcher jaduuuu = Pjaduu.matcher("jaduuuu");
		System.out.println("jaduuuu = "+jaduuuu.matches());
		

	}

}
