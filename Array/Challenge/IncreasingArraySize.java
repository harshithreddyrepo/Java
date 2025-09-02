package Array.Challenge;

public class IncreasingArraySize {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int bigArray[] = new int[10];
        System.out.println("size of Array:"+array.length);
        for(int i:array)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<array.length;i++)
        {
            bigArray[i]=array[i];
        }
        array=bigArray;
        System.out.println("size of Array:"+array.length);
        for(int i:bigArray)
        {
            System.out.print(i+" ");
        }
    }
}
