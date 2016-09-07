class Solution {
public:
    int findMin(vector<int>& nums) {
    	int n = nums.size();
    	if (n < 2) {
    		return nums[0];
    	}
    	for (int i = 0; i < n - 1; i++) {
    		if (nums[i + 1] - nums[i] < 0) {
    			while (nums[i + 1] - nums[i] < 0 && i <= n -1) {
    			    i ++;
    			}
    			if (i == n) {
    			    return nums[i-1];
    			} else {
    			    return nums[i];
    			}

    		}
    	}   
    	return nums[0];
    }
};