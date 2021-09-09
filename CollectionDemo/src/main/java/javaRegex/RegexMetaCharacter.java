package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		// character .
		System.out.println("++++++++++++++++++++++1+++++++++++++++++++++++");
		Pattern p = Pattern.compile("he.lo", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("heulO");
		System.out.println(m.matches());

		Matcher m1 = p.matcher("heklO");
		System.out.println(m1.matches());

		// [vw]-any one of these
		System.out.println("++++++++++++++++++++++2+++++++++++++++++++++++");
		Pattern p2 = Pattern.compile("ja[vw]a", Pattern.CASE_INSENSITIVE);
		Matcher m2 = p2.matcher("java");
		System.out.println("java= " + m2.matches());

		Matcher m3 = p2.matcher("jawa");
		System.out.println("jawa = " + m3.matches());

		Matcher m4 = p2.matcher("jata");
		System.out.println("jata = " + m4.matches());

		// [a-k] -any one in the range of character
		System.out.println("+++++++++++++++++++++ 3 ++++++++++++++++++++++++");
		Pattern aTOk = Pattern.compile("ja[a-k]a", Pattern.CASE_INSENSITIVE);
		Matcher java = aTOk.matcher("java");
		System.out.println("java= " + java.matches());

		Matcher jaka = aTOk.matcher("jaka");
		System.out.println("jaka = " + jaka.matches());

		// [a-zA-Z] -any one in the following range
		System.out.println("++++++++++++++++++++4+++++++++++++++++++++++++");
		Pattern aTOz = Pattern.compile("[a-zA-Z]");
		Matcher a = aTOz.matcher("a");
		System.out.println("a= " + a.matches());

		Matcher H = aTOz.matcher("H");
		System.out.println("H = " + H.matches());

		Matcher four = aTOz.matcher("4");
		System.out.println("four = " + four.matches());

		// [a-zA-Z0-9] -any one in following ranges
		System.out.println("+++++++++++++++++++5++++++++++++++++++++++++++");
		Pattern alphanum = Pattern.compile("[a-zA-Z0-9]");
		Matcher n = alphanum.matcher("n");
		System.out.println("n= " + n.matches());

		Matcher Y = alphanum.matcher("Y");
		System.out.println("Y = " + Y.matches());

		Matcher two = alphanum.matcher("2");
		System.out.println("two = " + two.matches());

		// digit character ---> \d
		System.out.println("+++++++++++++++++++++6++++++++++++++++++++++++");
		Pattern jfy = Pattern.compile("just\\dyou");
		Matcher just4you = jfy.matcher("just4you");
		System.out.println("just4you = " + just4you.matches());

		Matcher justforyou = jfy.matcher("justforyou");
		System.out.println("justforyou = " + justforyou.matches());

		// non digit character ---> \D
		System.out.println("+++++++++++++++++++++7++++++++++++++++++++++++");
		Pattern jFy = Pattern.compile("just\\Dyou");
		Matcher just4you1 = jFy.matcher("just4you");
		System.out.println("just4you1 = " + just4you1.matches());

		Matcher justforyou2 = jFy.matcher("justfyou");
		System.out.println("justfyou = " + justforyou2.matches());

		Matcher justFyou = jFy.matcher("justFyou");
		System.out.println("justFyou = " + justFyou.matches());

		// word character class code ---> \w  matches any one of character in [a-zA-Z0-9]
		System.out.println("+++++++++++++++++++++8++++++++++++++++++++++++");
		Pattern great= Pattern.compile("gr\\w");
		Matcher gr8 = great.matcher("gr8");
		System.out.println("gr8 = " + gr8.matches());

		Matcher grte = great.matcher("grte");
		System.out.println("grte = " + grte.matches());

		Matcher grT = great.matcher("grT");
		System.out.println("grT = " + grT.matches());
		
		Matcher gramper = great.matcher("gr&");
		System.out.println("gr& = " + gramper.matches());
		
		// non word character class code ---> \W  matches any one of character which are not in[a-zA-Z0-9]
		System.out.println("+++++++++++++++++++++9++++++++++++++++++++++++");
		Pattern great1= Pattern.compile("gr\\W");
		Matcher gr81 = great1.matcher("gr8");
		System.out.println("gr81 = " + gr81.matches());
		
		Matcher gramper1 = great1.matcher("gr&");
		System.out.println("gr&1 = " + gramper1.matches());

	}

}
