package method;
import java.util.Scanner;

public class MethodPractice {
    static int[] returnArray(int size)
    {
        int arr[] = new int[size];
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array required:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=returnArray(n);
        for(int i : array)
        {
            System.out.print("\t"+i);
        }


    }
}
