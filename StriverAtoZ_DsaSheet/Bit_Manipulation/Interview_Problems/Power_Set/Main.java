package StriverAtoZ_DsaSheet.Bit_Manipulation.Interview_Problems.Power_Set;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      int[] nums = new int[]{1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>(1 << nums.length);
        for (int i = 0; i < (1 << nums.length); i++) {
            List<Integer> list1 = new ArrayList<>(nums.length);
            for (int j = 0; j < nums.length; j++) {
                if ((1 & (i >> j)) == 1) {
                    list1.add(nums[j]);
                }
            }
            list.add(list1);
        }
        return list;

    }
}