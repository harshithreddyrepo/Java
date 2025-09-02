package Array.Challenge;

public class Inserting {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0]=2;
        arr[1]=5;
        arr[2]=4;
        arr[3]=7;
        arr[4]=2;
        arr[5]=1;

        //Note: no of elements in the array should be known
        System.out.println("lets insert 9 at index 3");
        for(int x:arr)
        {
            System.out.print(" "+x);
        }
        System.out.println();
        int ind=3;
        for(int i=6;i>ind;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[ind]=9;
        for(int x:arr)
        {
            System.out.print(" "+x);
        }



    }
}
