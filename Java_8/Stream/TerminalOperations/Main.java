package Java_8.Stream.TerminalOperations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
           List<Integer> list= Arrays.asList(1,2,3);
           // 1.collect()
             System.out.println(list.stream().skip(1).collect(Collectors.toList()));
             System.out.println(list.stream().skip(1).toList());

           // 2.forEach(consumer)
             list.stream().forEach(x-> System.out.println(x));

           // 3.reduce(BinaryOperator):Combines elements to produce a single result
             System.out.println("Sum of the elements in list:"+list.stream().reduce((x,y)->x+y).get());

           // 4.count()

           // 5.anyMatch(Predicate), allMatch(Predicate), noneMatch(Predicate)
             boolean b = list.stream().anyMatch(x -> x % 2 == 0);
             System.out.println("atlest one even elment is present in the list:"+b);

             boolean b1 = list.stream().allMatch(x -> x > 0);
             System.out.println("All the elements in the list are positive:"+b1);

             boolean b2 = list.stream().noneMatch(x -> x < 0);
             System.out.println("All the elements in the list are non negative:"+b2);

           // 6.findFirst(),findAny()
             Optional<Integer> first = list.stream().findFirst();
             System.out.println(first.get());

             Optional<Integer> any = list.stream().findAny();
             System.out.println(any.get());

           // 7.toArray()
           //converts stream into an array.
             Object[] array = Stream.of(1, 2, 3).toArray();

           // 8.min/max
           // returns maximum and minimum value in the stream.
             Optional<Integer> max = Stream.of(2, 44, 69).max(Comparator.naturalOrder());
             System.out.println("Maximum value:"+max.get());
             Optional<Integer> min = Stream.of(2, 44, 69).min(Comparator.naturalOrder());
             System.out.println("Minimum value:"+min.get());

           // Example
           // Streams cannot be used after a terminal operation has been called.
           List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
           Stream<String> stream = names.stream();
           stream.forEach(System.out::println);
           stream.map(String::toUpperCase).toList();
    }
}

