package stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WayToCreateStream {
    public static void main(String[] args) {

        //Using Array
        int [] intarray={10,8,9,7,6,12,20};
        IntStream intstream = Arrays.stream(intarray);
        intstream.forEach(System.out::println);

       

        String[] stringarray = new String[] { "a", "b", "c" };
        Stream<String> streamOfArrayFull = Arrays.stream(stringarray);
        streamOfArrayFull.forEach(System.out::println);

        Stream<String> stringarray1 = Stream.of(stringarray);

        /*Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<int[]> list = Arrays.asList(arr);*/

        /*List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);*/

    }
}
