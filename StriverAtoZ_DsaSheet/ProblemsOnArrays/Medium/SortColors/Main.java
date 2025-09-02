package StriverAtoZ_DsaSheet.ProblemsOnArrays.Medium.SortColors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] colors={2,0,2,1,1,0};
        sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }
        public static void sortColors(int[] nums) {
            int i=0,k=0,j=nums.length-1,temp;
            while(k<=j){
                if(nums[k]==2){
                    temp=nums[j];
                    nums[j]=nums[k];
                    nums[k]=temp;
                    j--;
                }else if(nums[k]==0){
                    // temp=nums[i];
                    // nums[i]=nums[k];
                    // nums[k]=temp;
                    if(i<k){
                        temp=nums[i];
                        nums[i]=nums[k];
                        nums[k]=temp;
                        i++;
                    }else{
                        while((nums[i]==0) && (i==k)){
                            i++;
                            k++;
                        }
                    }
                }else{
                    k++;
                }
            }

        }
}
