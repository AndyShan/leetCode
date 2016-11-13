package _455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
    	if (g == null || g.length == 0 || s == null || s.length == 0) {
    		return 0;
    	}
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int i = g.length - 1;
    	int j = s.length - 1;
    	int res = 0;
    	while (i >=0 && j >= 0) {
    		if (s[j] >= g[i]) {
    			i --;
    			j --;
    			res++;
    		} else {
    			i --;
    		}
    	}
    	return res;
    }
}