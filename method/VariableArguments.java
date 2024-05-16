package method;
import java.util.Scanner;


public class VariableArguments {
    static int add(int...a){
        int val=0;
        for(int temp: a)
        {
            val = val + temp;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println("enter the numbers to be added:");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int arr[] = new int[20];
        while(sc.hasNextInt())
        {

           arr[i] = sc.nextInt();

           i++;
        }
        System.out.println("sum of the elements entered:"+ add(arr));

    }
}
