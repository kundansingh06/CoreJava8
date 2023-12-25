package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ConvertingStream_To_Array_List {
    public static void main(String[] args) {

        //Converting from Streams to Arrays
        Stream<String> stream = Stream.of("a", "b", "c");
        String[] array = stream.toArray(String[]::new);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        //Converting from Streams to Lists
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> numbersList = numbersStream.collect(Collectors.toList());
        numbersList.forEach(number -> System.out.println(number));


        //Converting from Arrays to Streams
        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stream<Integer> streamOfIntegers = Arrays.stream(integers);

        //Converting from Lists to Streams
        List<String> lettersList = Arrays.asList("a", "b", "c", "d", "e");
        Stream<String> lettersStream = lettersList.stream();
        Stream<String> lettersParallelStream = lettersList.parallelStream();



    }
}
