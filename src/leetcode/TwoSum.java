package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        List<Integer> numList = new ArrayList<>();

        for (int i : nums) {
            numList.add(i);
        }


        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }
}
