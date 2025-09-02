package Collections.List.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1=new CopyOnWriteArrayList<>();
        list1.add(11);
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(55);
        System.out.println("list1:"+list1);
        List<Integer> list2=new ArrayList<>(list1);
        System.out.println("list2:"+list2);
        Integer[] arr={1,2,3,4,5};
        System.out.println("Array:"+Arrays.toString(arr));
        list2.addAll(Arrays.asList(arr));  //Converting an array  into list.
        System.out.println("lis2:"+list2);
        arr=list2.toArray(new Integer[0]);  //Converting a list into an array.
        System.out.println("Array:"+Arrays.toString(arr));

        for (int i:list1){
            System.out.println(i);
            if(i==22){
                list1.add(66);
            }
        }

        System.out.println(list1);

    }
}
