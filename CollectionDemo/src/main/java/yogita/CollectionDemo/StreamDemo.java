package yogita.CollectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Stream stream = list.stream();
		System.out.println(stream.toString());
		// java.util.stream.ReferencePipeline$Head@244038d0
		List<Integer> res = list.stream().filter(t -> t != 2).collect(Collectors.toList());
		System.out.println(res);
		// 1 3 4 5 6

		System.out.println("map==");
		List<Integer> res1 = list.stream().map(t -> t + 2).collect(Collectors.toList());
		System.out.println(res1);
		// 3 4 5 6 7 8

		long count = list.stream().filter(t -> t != 2).count();
		System.out.println("count== +" + count);
		// count== +5

		System.out.println("sorted==");
		List<Integer> res2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(res2);
		// 1 2 3 4 5 6

		System.out.println("sorted==");
		List<Integer> customisedSorted = list.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : ((i1 > i2) ? -1 : 0))
				.collect(Collectors.toList());
		System.out.println(customisedSorted);
		// sorted==
		// [6, 5, 4, 3, 2, 1]

		System.out.println("sorted==");
		List<Integer> customisedSorted1 = list.stream().sorted((i1, i2) -> i2.compareTo(i1))
				.collect(Collectors.toList());
		System.out.println(customisedSorted1);
		// sorted==
		// [6, 5, 4, 3, 2, 1]

		int min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("min=" + min);
		// min=1

		int max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("max=" + max);
		// max=6

		int min1 = list.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("min=" + min1);
		// min=6

		int max2 = list.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("max=" + max2);
		// max=1

		// list.stream().forEach(function),function can be lambda expression and
		// whenever there is lambda expression you can replace with ::
		list.stream().forEach(System.out::println);
		

	}

}
