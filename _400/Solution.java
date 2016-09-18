package _400;

public class Solution {
    public int findNthDigit(int n) {
    	int type = 1;
    	long weight = 9;
    	while (n > type * weight) {
    		n -= (int)type * weight;
    		type++;
    		weight *= 10;
    	}
    	
    	int num_pos = (n - 1) / type;
    	int num_pos_in = (n -1) % type;
    	int num = (int) (Math.pow(10, (type - 1)) + num_pos);
    	return Integer.valueOf((num + "").charAt(num_pos_in) + "");
    }
}

