package Array.Challenge;
import java.util.Scanner;
public class ReversingArray {
    public static void main(String[] args) {
        int []arr = new int[10];
        int i,j,temp;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []str = input.split("\\s");
        int n = str.length;
        for(i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        for(i=0,j=n-1;i<=j;i++,j--)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
     /*   int i=0,k,j;
        int n=0;
        int temp;
        String input;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            input=sc.nextLine();
            if(input.isEmpty())
            {
                break;
            }
            arr[i]=Integer.parseInt(input);
            i++;
            n++;
        }

        for(j=0,k=n-1;j<=k;j++,k--)
        {
            temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }  */
    }
}
