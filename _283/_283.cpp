class Solution {
public:
    void moveZeroes(vector<int>& nums) {
    	int length = nums.size();
        if (length < 1) {
        	return;
        }
        int first = 0;
        int sec = 0;
        while (sec < length) {
        	while (first < length && nums[first] != 0) {
        		first++;
        	}
        	
        	if (first == length) {
        		return;
        	}
        	sec = first + 1;
        	while (sec < length && nums[sec] == 0) {
        		sec++;
        	}
        	if (sec == length) {
        		return;
        	}
        	swap(nums,first,sec);
        }
        
    }
    
    void swap(vector<int>& nums,int i,int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
};
