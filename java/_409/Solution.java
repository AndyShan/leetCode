package _409;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public int longestPalindrome(String s) {
    	HashMap<String, Integer> map = new HashMap<>();
    	int len = s.length();
    	for (int i = 0; i< len; i++) {
    		if (map.containsKey(s.charAt(i) + "")) {
    			map.put(s.charAt(i) + "", map.get(s.charAt(i) + "") + 1);
    		} else {
    			map.put(s.charAt(i) + "", 1);
    		}
    	}
    	int res = 0;
    	boolean flag = false;
    	for (Entry<String, Integer> entry : map.entrySet()) {
    		if (entry.getValue() / 2 > 0) {
    			res += (entry.getValue() / 2) * 2;
    			if (flag == false && entry.getValue() % 2 == 1) {
    				res += 1;
    				flag = true;
    			}
    		} else {
    			if (flag == false) {
    				res += 1;
    				flag = true;
    			}
    		}
    	}
    	return res;
    }
}
