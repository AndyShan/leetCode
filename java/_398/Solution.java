package _398;

import java.util.ArrayList;
import java.util.Random;

public class Solution {
	int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i < nums.length;i++) {
        	if (nums[i] == target) {
        		list.add(i);
        	}
        }
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */