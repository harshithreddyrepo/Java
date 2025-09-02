import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
     //   System.out.println(num);
        int n=num,rem;
     //   System.out.println(n);
        int sum=0;
        while(n>0)
        {
            rem=n%10;
           // System.out.println(rem);
            sum=sum*10+rem;
          //  System.out.println(sum);
            n=n/10;
        }
        System.out.println(sum);
            System.out.println(sum==num);
    }
}
