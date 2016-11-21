package _462;

import java.util.Arrays;

public class Solution {
    public int minMoves2(int[] nums) {
    	Arrays.sort(nums);
    	
    	int m = nums.length / 2;
    	int res = 0;
    	for (int i : nums) {
    		res += Math.abs(i - nums[m]);
    	}
    	return res;
    }
}