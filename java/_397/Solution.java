package _397;

public class Solution {
    public int integerReplacement(int n) {
    	long nn = n;
    	int index = 0;
    	while (nn > 1) {
    		if (nn % 2 != 0) {
    		    if (nn > 3) {
        			nn = odd(nn);
    	    		index++;
    		    } else {
    		        nn -= 1;
    		        index++;
    		    }

    		} else {
    			nn = even(nn);
    			index++;
    		}
    	}
    	return index;
    }
    public long odd(long nn) {
    	if (((nn + 1) / 2) % 2 == 0) {
    		return nn+1;
    	} else {
    		return nn - 1;
    	}
    }
    public long even(long nn) {
    	return nn / 2;
    }
}