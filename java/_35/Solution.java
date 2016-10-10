package _35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
    	
    	return binarySearch(nums, target);
    }
    
    public static int binarySearch(int[] nums, int target){ 
    	
    		int low = 0; 
    		int high = nums.length-1; 
    		while(low <= high) { 
    			int middle = (low + high)/2; 
    			if(target == nums[middle]) { 
    			    return middle; 
    			}else if(target <nums[middle]) { 
    			    high = middle - 1; 
    			}else { 
    			    low = middle + 1; 
    			}
    		}
    		return low;
       }
}