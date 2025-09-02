import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,4,7,3,1,7,3,8,6,4};
        System.out.println(Arrays.toString(arr));
        int temp;
        for(int i=0,j=arr.length-1;i<j; i++,j--)
        {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
