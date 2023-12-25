package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner j1 = new StringJoiner(","); // passing comma(,) as delimiter
		j1.add("Rahul");
		j1.add("Raju");
		j1.add("Peter");
		j1.add("Raheem");

		StringJoiner j2 = new StringJoiner(",", "[", "]");

		j2.add("Rahul");
		j2.add("Raju");
		j2.add("Peter");
		j2.add("Raheem");

		System.out.println(j1);

		System.out.println(j2);

	}

}
