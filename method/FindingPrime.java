package method;
import java.util.Scanner;

public class FindingPrime {
    static int prime(int num){
        int count=1;
        for(int i=2;(i*i)<=num;i++){
            if(num%i==0){
                System.out.println(num +" is not prime number");
                return 0;
            }
        }

            System.out.println(num +" is prime number");
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);

    }
}
