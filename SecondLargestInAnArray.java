public class SecondLargestInAnArray
{
    public static void main(String[] args) {
        int[] arr = {4,2,3,4,1,2,3,4,2,3,6,3,3,4,4,5};
        int max1,max2;
        max2=max1=arr[0];
        for (int i=1;i<arr.length;i++) {
            if(max1<arr[i]) {
                max2=max1;
                max1=arr[i];
            } else if (max2<arr[i]) {
                max2=arr[i];
            }
        }
        System.out.println("Second Largest element is \""+max2+"\" and first largest element is \""+max1+"\".");
    }
}
