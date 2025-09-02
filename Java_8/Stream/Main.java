package Java_8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // feature introduced in java 8
        // process collections of data in functional and declarative manner
        // simplify Data processing
        // Embrace Functional programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        // Whenever we want to process the collections of data
        // in Functional and Declarative manner then we use Streams.

        //What is stream?
        // a sequence of elements supporting functional and declarative programming.

        //How to use Streams?
        // Source, intermediate operations and terminal operation

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        // Task: count no. of even numbers in the collection

        // Method-1: Traditional approach
        int count=0;
        /*
        for(int i:numbers){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("no. of even numbers in the collection:"+count);
        */

        // Method-2: Stream approach
       count=(int)numbers.stream().filter(x->x%2==0).count();
       System.out.println("no. of even numbers in the collection:"+count);


        ////Creating Streams

        // 1.From collections
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream=list.stream();

        //2. From Arrays
        String[] array={"a","b","c"};
        Stream<String> stream1 = Arrays.stream(array);
        System.out.println("stream1:"+stream1);

        // 3. Using Stream.of()
        Stream<String> a = Stream.of("a", "b");

        // 4.Infinite streams
        List<Integer> collect = Stream.generate(() -> 1).limit(100).toList();
        System.out.println("Using Stream.generate():"+collect);

        List<Integer> collect1 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println("Using Stream.iterate():"+collect1);

                                  /***   //PRACTICE//   ***/
        //Example 1:find the strings with the length greater than 3.
        List<String> names=Arrays.asList("Anna","Bob","Charlie","David");
        List<String> result1 = names.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.println("Example 1:"+result1);

        //Example 2: Squaring and sorting numbers
        List<Integer> nums1=Arrays.asList(5,2,9,1,6);
        List<Integer> result2 = nums1.stream().map(x -> x * x).sorted().collect(Collectors.toList());
        System.out.println("Example 2:"+result2);

        //Example 3: Summing Values
        List<Integer> nums2=Arrays.asList(1,2,3,4,5);
        Optional<Integer> result3 = nums2.stream().reduce((x, y) -> x + y);
        System.out.println("Example 3:"+result3.get());

        //Example 4: Counting occurrence of a character
        String sentence="Hello world";
        char[] charArr=sentence.toCharArray();
        //Arrays.stream(charArr);//Error; Arrays.stream() doest accept an character array.
        long result4 = sentence.chars().filter(x -> x == 'l').count();
        //IntStream chars = sentence.chars();  returns an integer stream
        System.out.println("Example 4:"+result4);

    }

}
