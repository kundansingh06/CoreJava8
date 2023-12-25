package stream.arraystream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraySreamExample {
    public static void main(String[] args) {
        int [] arrexample = {7,8,9,4,3,2,10,12,10,11,2};

        Arrays.stream(arrexample).forEach(System.out::print);
        Arrays.stream(arrexample).forEach(v-> System.out.print(v+" "));
        Arrays.stream(arrexample).sorted().forEach(v-> System.out.print(v+" "));
        Arrays.stream(arrexample).distinct().forEach(v-> System.out.print(v+" "));
        
        int maxelement = Arrays.stream(arrexample).max().getAsInt();
        int minelement = Arrays.stream(arrexample).min().getAsInt();
        int sumelement = Arrays.stream(arrexample).sum();
        double avgelement = Arrays.stream(arrexample).average().getAsDouble();
        Arrays.stream(arrexample).filter(a->a>10).forEach(v-> System.out.print(v+" "));




        List<Integer> list = Arrays.asList(1, 2, 3, 4,4, 5,5,6);
        List<Integer> al = list.stream().collect(Collectors.toList());
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        Double AverageofIntegers = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        Integer SumofIntegers = list.stream().collect(Collectors.summingInt(Integer::intValue));
        Optional<Integer> maxbyelement = list.stream().collect(Collectors.maxBy(Integer::compare));
        System.out.println(al);
        System.out.println(set);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(letters.stream().collect(Collectors.joining("!")));

        List<Integer> filetrexample = list.stream().filter(number -> number < 3).collect(Collectors.toList());


        List<String> letters1 = Arrays.asList("a", "b", "c");
        List<String> upperCase = letters1.stream()
                .map((String element) -> element.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCase);

        List<String> upperCase2 = letters1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase2);


        List<String> let1 = Arrays.asList("a", "b");
        List<String> let2 = Arrays.asList("b", "c", "d");
        List<String> let3 = Arrays.asList("e", "f");
        List<List<String>> listOfLetters = Arrays.asList(let1, let2, let3);
        List<String> flatList = listOfLetters.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);


    }
}
