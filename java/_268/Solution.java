package _268;

public class Solution {
    public int missingNumber(int[] nums) {
        int a = nums[0];
        int index = 0;
        for (int i = 0;i < nums.length;i++) {
        	if (nums[i] == a + i) {
        		if (i == nums.length - 1) {
            		index = nums[i] + 1;
        		}
        	} else {
        		index = a + i;
        		break;
        	}
        }
        return index;
    }
}