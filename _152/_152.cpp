class Solution {
public:
    int maxProduct(vector<int>& nums) {
    	int n = nums.size();
    	if (n < 1) {
    		return 0;
    	}
    	int max_local = nums[0];
    	int min_local = nums[0];
    	int globel = nums[0];
    	for (int i = 1; i < n; i++) {
    		int max_copy = max_local;
    		cout << max_copy << endl;
    		max_local = max(max(nums[i],max_local * nums[i]), min_local * nums[i]);
    		cout << max_local << endl;
    		min_local = min(min(nums[i],max_copy * nums[i]),min_local * nums[i]);
    		cout << min_local << endl;
    		globel = max(globel, max_local);
    	}
    	return globel;
    }
};
