package foreach;
import java.util.ArrayList;
import java.util.List;
public class ForEach_Example {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Football");
		al.add("Cricket");
		al.add("Chess");
		al.add("Hocky");

		System.out.println("Iterating by passing lambda expression");
		al.forEach((a) -> {System.out.println(a);});
		al.forEach(a -> {System.out.println(a);});
		al.forEach(a -> System.out.println(a));

		System.out.println("Iterating by passing method reference");
		al.forEach(System.out::println);

		System.out.println("Iterating by passing lambda expression");
		al.stream().forEachOrdered(games -> System.out.println(games));

		System.out.println("Iterating by passing method reference");
		al.stream().forEachOrdered(System.out::println);
	}
}
