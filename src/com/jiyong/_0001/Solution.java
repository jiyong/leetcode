package com.jiyong._0001;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @author jiyong.me
 * @date 2021/1/6
 */
public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];

        for(int i=0; i<length; i++) {
            for(int j=i+1; j<length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;
    }

    public static void  main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        Solution solution = new Solution();

        int[] result = solution.TwoSum(nums, target);

        System.out.print(result[0]);
        System.out.println(result[1]);
    }
}
