package Java_8.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

interface MathOperation{
    int operate(int a,int b);
}

class Add implements MathOperation{
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {
     /*   Add add = new Add();
        System.out.println(add.operate(5, 7));

        //LAMBDA EXPRESSION
        MathOperation multi = (a, b) -> a * b;
        System.out.println(multi.operate(5, 7));

        //PREDICATE is used to hold the conditions;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(8));
        //example:
        Predicate<String> isWordStartingWith_S = x -> x.startsWith("S");
        System.out.println(isWordStartingWith_S.test("SRIJA"));
        Predicate<String> isWordEndingWith_A = x -> x.endsWith("A");
        Predicate<String> and = isWordEndingWith_A.and(isWordStartingWith_S);
        System.out.println(and.test("SRIJA"));


       //  FUNCTION : takes input and returns output.
       //  public interface Function<T,R>{
       //    R appaly(T t);
       // }

        Function<String,Integer> strlen=x->x.length();
        System.out.println(strlen.apply("Harshith"));
        //example:
        Function<Integer,Integer> doubleIt=x->x*2;
        System.out.println(doubleIt.apply(7));
        Function<Integer,Integer> squareIt=x->x*x;
        System.out.println(squareIt.apply(7));
        System.out.println(doubleIt.andThen(squareIt).apply(5));
        System.out.println(doubleIt.compose(squareIt).apply(5));

        //IDENTITY
        Function<Integer,Integer> identical=Function.identity();
        System.out.println(Function.identity().apply(5));

        //CONSUMER
        //it takes the input, process it and doesn't return any output.
        Consumer<String> greet=x-> System.out.println("hello "+x+"!");
        greet.accept("Sir");

        Consumer<String> respect=x-> System.out.println("please take your seat "+x+"(:");
        respect.accept("Sir");

        greet.andThen(respect).accept("Arjun");

        //SUPPLIER
        //it doesn't take any input but provides the output;
        Supplier<String> giveHelloWorld=()->"Hello world!";
        System.out.println(giveHelloWorld.get());

        //BiPredicate,BiConsumer,BiFunction
        BiPredicate<Integer,Integer> isSumEven=(x,y)->(x+y)%2==0;
        System.out.println(isSumEven.test(5,7));

        BiPredicate<String,Integer> guessTheLength=(x,y)->x.length()==y;
        System.out.println(guessTheLength.test("Harshith",8));

        //BiConsumer
        BiConsumer<Integer,Integer> twoSum=(x,y)-> System.out.println("sum is:"+(x+y));
        twoSum.accept(01,6);

        //BiFunction
        BiFunction<Integer,Integer,Double> ratio=(x,y)->(double)x/y;
        System.out.println(ratio.apply(7,5));

        //Function<Integer,Integer> ; UnaryOperator<Integer>
        UnaryOperator<Integer> mulBy5=(x)->x*5;
        System.out.println(mulBy5.apply(20));

        //BiFunction<Integer,Integer,Integer> ; BinaryOperator<Integer>
        BinaryOperator<Integer> mul=(x,y)->x*y;
        System.out.println(mul.apply(11,13));
        */

        //Method reference-->use method without invoking & in place of lambda expression.
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam","Gani");
        Iterator<String> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            int num = itr.next();
            if (num % 2 == 0) {
                itr.remove();
            }
        }
            System.out.println(numbers);


    }
}
