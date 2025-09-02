package Java_8.Stream.PrimitiveStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);  // IntStream

        Integer[] nums = {1,2,3,4,5};
        Stream<Integer> stream1 = Arrays.stream(nums); // Stream<Integer>

        Stream<Integer> boxed = stream.boxed();  // IntStream -> Stream<Integer>

        //range()
        IntStream range = IntStream.range(2, 8);
        ArrayList<Integer> collect = range.boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);

      //  DoubleStream doubleStream = stream.asDoubleStream(); // IntStream -> DoubleStream

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().collect(Collectors.toCollection(ArrayList::new)).toString() );

    }
}
