package _416;

public class Solution {
    public boolean canPartition(int[] nums) {
    	int sum = 0;
    	for (int i : nums) {
    		sum += i;
    	}
    	if (sum % 2 != 0) {
    		return false;
    	}
    	int half = sum / 2;
    	return kp(half, nums.length, nums );
    }
    
    public boolean kp(int w, int s,int[] nums) {
    	if (w == 0) {
    		return true;
    	}
    	if (w < 0 || w > 0  && s == 0) {
    		return false;
    	}
    	if (kp(w - nums[s - 1], s - 1, nums)) {
    		return true;
    	}
    	return kp(w, s - 1,nums);
    }
}