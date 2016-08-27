class Solution {
public:
    Solution(vector<int> nums):v(nums) {
        
    }
    
    /** Resets the array to its original configuration and return it. */
    vector<int> reset() {
        return v;
    }
    
    /** Returns a random shuffling of the array. */
    vector<int> shuffle() {
        vector<int> res = v;
        int length = v.size();
        for (int i = 0; i < length; i++) {
        	int j = rand() % length;
        	swap(res[i],res[j]);
        }
        return res;
    }
private:
	vector<int> v;
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * vector<int> param_1 = obj.reset();
 * vector<int> param_2 = obj.shuffle();
 */
