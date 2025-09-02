package StriverAtoZ_DsaSheet.ProblemsOnArrays.Easy.CheckIfTheArraySortedAndRotated;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1};
        System.out.println(check(nums));
    }

        public static boolean check(int[] nums) {
            int x=0,count=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[x]){
                    x=i;
                }
            }
            while(count<nums.length-1){
                if(nums[x%nums.length]==nums[(x-1+nums.length)%nums.length]){
                    x=(x-1+nums.length)%nums.length;
                }
                count++;
            }
            count=0;
            //int i=1;
            while(count<nums.length-1){
                if(nums[(x)%nums.length]>nums[(x+1)%nums.length]){
                    return false;
                }
                x=x+1;
                count++;
            }
            return true;
        }

}
