package typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {
	public static void main(String[] args) {

		//An old approach(prior to Java 7) to create a list
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		System.out.println(al);

		//An new approach(at Java 8) to create a list
		List<Integer> al2 = new ArrayList<>();
		al2.add(20);
		al2.add(21);
		al2.add(22);
		System.out.println(al2);

	}

}
