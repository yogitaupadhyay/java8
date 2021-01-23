package yogita.CollectionDemo;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));

		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
		// 1. lambda expression
		// 2. functional interface
		// 3. default method and static method
		// 4. Predefined functional interface
		// predicate
		// function
		// consumer
		// supplier
		// 5. Double colon operator
		// method reference
		// constructor reference
		// 6. streams
		// 7.date and time api
		// 8.optional class
		// 9.noshorn javaSCRIPT ENGINE

	}

}
