package _3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int n = s.length();
    	Map<String,Integer> map = new HashMap<>();
    	int max = 0, i = 0, j = 0;
    	while (j < n) {
    		if (map.containsKey(s.charAt(j) +"")) {
    			if (max < j - i) {
    				max = j - i;
    			}
    			while (s.charAt(i) != s.charAt(j)) {
    				map.remove(s.charAt(i)+ "");
    				i++;
    			}
    			map.put(s.charAt(j) + "", 0);
    			i++;
    			j++;
    		} else {
    			map.put(s.charAt(j)+"", 0);
    			j ++;
    		}
    	}
    	if (max < j-i) {
    		max = j-i;
    	}
    	return max;
    }
}