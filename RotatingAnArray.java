
import java.util.Arrays;

public class RotatingAnArray {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3};
        int[] arr2={2,1,4,5,3};
        //RIGHT SHIFT BY 2
        for(int i=0;i<arr.length;i++){
           arr[((2+i)%(arr.length))] = arr2[i];
        }
        System.out.println("RIGHT SHIFT BY 2");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));

        // LEFT SHIFT BY 2
        for(int i=0;i<arr.length;i++){
            arr[i]=arr2[((2+i)%(arr.length))];
        }
        System.out.println("LEFT SHIFT BY 2");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }
}
