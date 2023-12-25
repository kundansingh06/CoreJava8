package stream.string_integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_String {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "abc", "", "bcd", "", "defg", "jkc");
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 6, 4, 5, 6, 7, 8, 6, 7, 8);

		List<String> allf = strList.stream().map(i -> i + "a")
				.map(x -> x.toUpperCase())
				.filter(x -> !x.isEmpty())
				.filter(x -> x.length() > 2)
				.filter(x -> x.startsWith("a")).collect(Collectors.toList());

		String joining = strList.stream().collect(Collectors.joining("="));
		List<String> al = strList.stream().distinct().collect(Collectors.toList());
		Set<String> set = strList.stream().distinct().collect(Collectors.toSet());


		Stream<Integer> f1 = intList.stream().filter(a -> a % 2 == 0);
		f1.forEach(System.out::print);
		
		
		List<Integer> squaresList = intList.stream()
				.filter(a -> a % 2== 0)
				.map(i -> i * i)
				.limit(10)
				.distinct()
				.sorted().collect(Collectors.toList());
		System.out.println(squaresList);
		
	
		
Map<String, Long> groupCount = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
Map<Integer, Long> groupCount2 = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		groupCount.entrySet().stream().filter(e->e.getValue()>3).map(e->e.getKey()).collect(Collectors.toList());
		
		String str = "dbsdbsdbs";
		String[] sArr = str.split("");
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(sArr));
		Map<String, Long> map = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}