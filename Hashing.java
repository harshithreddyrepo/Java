import java.util.Scanner;
public class Hashing {

    static int[] hashing(int []arr) {

        int []hashArr = new int[13]; //  an array of size 13 is created; in this array the count of each variable is stored
        int count;
        for(int i=0;i<hashArr.length;i++)
        {
            count=0;
            for(int j : arr)
            {
                if(i==j)
                {
                    count++;
                }
            }
           hashArr[i]=count;
        }
        return hashArr;
    }

    public static void main(String[] args) {
        int []arr = {0,1,2,3,4,5,6,7,8,9,10,11,11,11,12,12,12,12};
        int []hashedArr = hashing(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int num = sc.nextInt();
        if(num>=0 && num<=12)
        {
            System.out.println("the count of "+ num + " is:"+ hashedArr[num]);
        }
        else
        {
            System.out.println("input is invalid");
        }




    }
}