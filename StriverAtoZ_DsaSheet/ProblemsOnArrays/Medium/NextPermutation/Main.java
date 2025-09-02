package StriverAtoZ_DsaSheet.ProblemsOnArrays.Medium.NextPermutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={2,3,1};
        nextPermutation(nums);
        System.out.println("Expected:[3,1,2]");
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int i=nums.length-1,temp;
        while((i>0)&&(nums[i]<=nums[i-1])){
            i--;
        }

        if(i==0){
            sort(nums,0);
        }else{
            int minInd=findMin(nums,i);
            // swap(nums[minInd],nums[i-1]);
            temp=nums[minInd];
            nums[minInd]=nums[i-1];
            nums[i-1]=temp;

            sort(nums,i);
        }
    }

    public static int findMin(int[] nums,int i){
        int min=i,lowerLim=nums[i-1];
        for(i=i+1;i<nums.length;i++){
            if((nums[i]<nums[min])&&(nums[i]>lowerLim)){
                min=i;
            }
        }
        return min;
    }

    public static void sort(int[] nums,int i){
        int temp;
        for(int j=0;j<nums.length-i;j++){
            for(int k=i;k<nums.length-j-1;k++){
                if(nums[k]>nums[k+1]){
                    temp=nums[k];
                    nums[k]=nums[k+1];
                    nums[k+1]=temp;
                }
            }
        }
    }
}
