package StriverAtoZ_DsaSheet.ProblemsOnArrays.Medium.SubarraySumEqualsK;

public class Main {
    public static void main(String[] args) {
      int[] nums={1,1,1};
        System.out.println(subarraySum(nums,2));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < k) {
                sum = sum + nums[i];
            }
                if (sum == k) {
                    count = count + 1;
                    sum = sum - nums[j];
                    j++;
                } else {
                    while (sum > k) {
                        sum = sum - nums[j];
                        j++;
                    }
                    if (sum == k) {
                        count = count + 1;
                        sum = sum - nums[j];
                        j++;
                    }
                }
            }

        return count;
    }
}

