package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayBased {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> first = intList.stream().findFirst();
		if (first.isPresent()) {
			System.out.println(first.get());
		} else {
			System.out.println("Stream empty");
		}

		List<Integer> numbers1 = new ArrayList<>();
		Optional<Integer> first1 = numbers1.stream().findFirst();
		if (first1.isPresent()) {
			System.out.println(first1.get());
		} else {
			System.out.println("Stream empty");
		}

		/*
		* Getting any element from a parallel stream is useful if you have a large stream
		and don’t care about the ordering.
		* */
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> first2 = numbers2.parallelStream().findAny();
		if (first2.isPresent()) {
			System.out.println(first2.get());
		} else {
			System.out.println("Stream empty");
		}



		Optional<Integer> op = intList.stream().reduce((a, b) -> (a + b));
		if (op.isPresent()) {
			System.out.println(op.get());
		} else {
			System.out.println("Array is empty");
		}

		
		String[] str = new String[10];
		Optional<String> op2 = Optional.ofNullable(str[5]);
		if (op2.isPresent()) { // check for value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else {
			System.out.println("string value is not present");
		}

	}

}
