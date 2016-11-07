package _453;

public class Solution {
    public int minMoves(int[] nums) {
    	if (nums == null || nums.length <= 0) {
    		return 0;
    	}
    	int res = 0;
    	int min = Integer.MAX_VALUE;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] < min) {
    			min = nums[i];
    		}
    	}
    	for (int i = 0; i < nums.length; i++) {
    		res += nums[i] - min;
    	}
    	return res;
    }
}