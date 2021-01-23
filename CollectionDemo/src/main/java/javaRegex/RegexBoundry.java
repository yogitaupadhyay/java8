package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBoundry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ^ Beginning of line -start of input string
		System.out.println("+++++++++++++++++++++1++++++++++++++++++++++++");
		Pattern lb = Pattern.compile("^");
		Matcher m = lb.matcher("hi mam\n myself yogita");
		while (m.find()) {
			System.out.println(m.start() + " -> " + m.end());
		}

		// check whether string starts with https://
		Pattern urlpat = Pattern.compile("^https://");
		Matcher url = urlpat.matcher("https://www.nitrr.ac.in");
		while (url.find()) {
			System.out.println(url.start() + " -> " + url.end());
		}

		// end of input string $
		System.out.println("+++++++++++++++++++++2++++++++++++++++++++++++");
		Pattern urlend = Pattern.compile(".in$");
		Matcher urlstr = urlend.matcher("https://www.nitrr.ac.in");
		while (urlstr.find()) {
			System.out.println(urlstr.start() + " -> " + urlstr.end());
		}

		// word boundary \b
		System.out.println("+++++++++++++++++++++3++++++++++++++++++++++++");
		Pattern wbndry = Pattern.compile("\\b");
		Matcher words = wbndry.matcher("once upon a time there lived a king");
		while (words.find()) {
			System.out.print(words.start() + " -> " + words.end() + "  , ");
		}
		System.out.println();

		// words starting with t
		System.out.println("+++++++++++++++++++++4++++++++++++++++++++++++");
		Pattern wbndryt = Pattern.compile("\\bt");
		Matcher wordst = wbndryt.matcher("once upon a time there lived a king");
		while (wordst.find()) {
			System.out.print(wordst.start() + " -> " + wordst.end() + "  , ");
		}
		System.out.println();

	}

}
