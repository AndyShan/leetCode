package _456;


public class Solution {
	public boolean find132pattern(int[] nums) {
		if (nums == null || nums.length < 3) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
				}
				if (nums[j] < max && nums[j] > nums[i]) {
					return true;
				}
			}
		}
		return false;
	}
}

