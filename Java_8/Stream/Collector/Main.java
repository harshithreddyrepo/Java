package Java_8.Stream.Collector;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1.Collecting to a lsit
        List<String> names= Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);


        // 2.Collecting to a set
        List<Integer> nums=Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> collect = nums.stream().collect(Collectors.toSet());
        System.out.println(collect);

        // 3.Collecting to a Specific Collection
        ArrayDeque<String> collect1 = names.stream().collect(Collectors.toCollection(ArrayDeque::new));


        // 4.Joining Strings
        // Concatenates stream elements into a single String
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining());
        System.out.println("joining():"+concatenatedNames);

        String concatenatedNames1 = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("joining(', ') using separator:"+concatenatedNames1);

        // 5.Summarizing Data
        // Generates statistical summary (count,sum,min,average,max)
        List<Integer> numbers=Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println("Count:"+stats.getCount());
        System.out.println("Sum:"+stats.getSum());
        System.out.println("Max:"+stats.getMax());
        System.out.println("Min:"+stats.getMin());
        System.out.println("Average:"+stats.getAverage());

        // 6.Calculating Average
        double average = numbers.stream().collect(Collectors.summarizingInt(x->x)).getAverage();
        System.out.println("Average:"+average);

       // 7.Counting Elements
       // long count = numbers.stream().count();
        long count = numbers.stream().collect(Collectors.summarizingInt(x->x)).getCount();
        System.out.println(count);

       // 8.Grouping Elements
       List<String> words=Arrays.asList("hello","world","java","streams","collecting");
        Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println("Grouping Elements collect2:"+collect2);

        Map<Integer, String> collect3 = words.stream().collect(Collectors.groupingBy((String::length), Collectors.joining(", ")));
        System.out.println("Grouping Elements collect3:"+collect3);

        TreeMap<Integer, Long> collect4 = words.stream().collect(Collectors.groupingBy((String::length), TreeMap::new, Collectors.counting()));
        System.out.println("Grouping Elements collect4:"+collect4);

        // 9.Partitioning Elements
        // partitions elements into two groups (true and false) based on a predicate
        Map<Boolean, List<String>> collect5 = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collect5);

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        ArrayList<String> collect6 = words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toCollection(ArrayList::new)));
        System.out.println(collect6);

        //Example 1: Collecting Names by Length
        List<String> l1=Arrays.asList("Anna","Bob","Alexander","Brain","Alice");
        Map<Integer, List<String>> collect7 = l1.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collect7);

        //Example 2: Counting Word Occurrences
        String sentesnce="hello world hello java world";
        String[] s = sentesnce.split(" ");
        Map<String, Long> collect8 = Arrays.stream(s).collect(Collectors.groupingBy((x -> x), Collectors.counting()));
        System.out.println(collect8);

        //Example 3: Partioning Even and Odd numbers
        List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> collect9 = l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect9);

        //Example 4: Summing values in a Map
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);

        Collection<Integer> values = items.values();
       // Optional<Integer> reduce = values.stream().reduce((x, y) -> x + y);
       // System.out.println(reduce.get());
        long sum = values.stream().collect(Collectors.summarizingInt(x -> x)).getSum();
        System.out.println(sum);

        //Example 5: Creating a Map from Stream Elements
        List<String> fruits=Arrays.asList("Apple","Banana","Cherry");
        Map<String, Integer> collect10 = fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length()));
        System.out.println(collect10);

        // Example 6: Counting the occurrence of values using toMap()
        List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
        Map<String, Integer> collect11 = words2.stream().collect(Collectors.toMap(x -> x, x -> 1, (x, y) -> x + y));
        // whenever the keys are repeated then the value will be updated to previous value plus present value (i.e., (x,y)->x+y)
        System.out.println(collect11);


    }
}
