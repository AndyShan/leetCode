package _392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
    	int sum = 0;
    	int i = 0,j = 0;
    	int n = s.length();
    	int m = t.length();
    	if (n == 0) {	
    		return true;
    	}
    	if (m == 0) {
    		return false;
    	}
    	while (i < n && j < m) {
    		if (s.charAt(i) != t.charAt(j)) {
    			j ++;
    		} else {
    			sum++;
    			i++;
    			j++;
    		}
    		if (sum == s.length()) {
    			return true;
    		}
    	}
    	return false;
    }
}