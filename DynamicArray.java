import java.util.Arrays;
public class DynamicArray {
    static int[] array = new int[5];
    static int i=0;
    public static void main(String[] args) {
       for(int k=1;k<=30;k++){
           add(k);
       }
        System.out.println(Arrays.toString(array));
    }
    static void add(int n){
        if(i<array.length){
            array[i++] = n;
        } else {
            int[] arr = new int[2*array.length];
            for(int j=0;j< array.length;j++){
                arr[j]=array[j];
            }
            arr[i++]=n;
            array=arr;
        }
    }
}
