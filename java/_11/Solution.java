package _11;

public class Solution {
    public int maxArea(int[] height) {
    	int n = height.length;
    	int r = n - 1;
    	int l = 0;
    	int res = Integer.MIN_VALUE;
    	while (l < r) {
    		res = Math.max(res,Math.min(height[l],height[r]) * (r - l));
    		if (height[l] < height[r]) {
    			int k = l;
    			while (k < r && height[k] <= height[l]) {
    				k ++;
    			}
    			l = k;
    		} else {
    			int k = r;
    			while (k > l && height[k] <= height[r]) {
    				k --;
    			}
    			r = k;
    		}
    	}
    	return res;
    }
}