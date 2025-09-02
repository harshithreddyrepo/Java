package Java_8.Stream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        List<String> list= Arrays.asList("Akshith","Ram","Shyam","Ganshyam","Akshith");

        // 1.filter()
        Stream<String> filteredStream=list.stream().filter(x->x.startsWith("A"));
        // no filtering at this point
        long res=filteredStream.count();
        System.out.println("No. of names starts with 'A':"+res);

        //2.map()
        List<String> list1 = list.stream().map(String::toUpperCase).toList();
        System.out.println(list1);

        //3.sorted()
        Stream<String> sortedStream=list.stream().sorted(); // Natural sorting
        List<String> sorted = list.stream().sorted((x, y) -> x.length() - y.length()).toList();  //Sorted String using Comparator
        System.out.println(sorted);

        // 4.distinct()
        long a = list.stream().filter(x -> x.startsWith("A")).distinct().count();
        System.out.println("No. of unique strings starts with 'A':"+a);

        // 5.limit()
        List<Integer> list2 = Stream.iterate(1, x -> x + 1).limit(10).toList();
        System.out.println("Using Stream.iterate():"+list2);

        // 6.skip()
        List<Integer> list3 = Stream.iterate(0, x -> x + 1).skip(5).limit(10).toList();
        System.out.println(list3);

        // 7.peek()
        //performs a specified action on each element of the stream without consuming the element.
        long count = Stream.iterate(1, x -> x + 1).skip(10).limit(20).peek(System.out::println).count();
        System.out.println("count:"+count);

        // 8.flatMap()
        // handle streams of collections, lists, or arrays where each element is itself a collection.
        // Flatten nested structures(e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transforms and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grape")
        );
        List<String> list4 = listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
        System.out.println("list4:"+list4);

        List<String> listOfStrings=Arrays.asList(
                "Hello world",
                "java streams are powerful",
                "flatmap is useful"
        );
        List<String> list5 = listOfStrings.stream().flatMap(x -> Arrays.stream(x.split(" "))).collect(Collectors.toList());
        System.out.println(list5);
    }
}
