package _303;

public class NumArray {
	int[] mySums;
    public NumArray(int[] nums) {
    	if (nums.length !=0) {
    		mySums = new int[nums.length];
        	if (mySums.length > 1) {
        		mySums[0] = nums[0];
        		int index = 0;
        		for (index = 1;index < mySums.length;index ++) {
        			mySums[index] = mySums[index - 1] + nums[index];
        		}
        	}else {
        		mySums[0] = nums[0];
        	}
    	}else {
    		mySums = nums;
    	}
    	
    }
    
    public int sumRange(int i, int j) {
    	if (i != j) {
    		if (i != 0) {
        		return mySums[j] - mySums[i - 1];
        	}else {
        		return mySums[j];
        	}
    	}else {
    		return mySums[j];
    	}
    	
    }


}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);