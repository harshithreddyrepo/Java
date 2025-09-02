package Array.Challenge;

public class ExploreArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int []copyArray = arr;
        copyArray[2]=0;
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
// Conclusion: Arrays are mutable...