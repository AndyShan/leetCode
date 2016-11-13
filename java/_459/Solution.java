package _459;

public class Solution {
    public boolean repeatedSubstringPattern(String str) {
    	int size = str.length();
    	char first = str.charAt(0);
    	boolean flag = true;
    	int num = 0;
    	for (int i = 1; i < size; i++) {
    		if (str.charAt(i) == first) {
    			num ++;
    			String sub = str.substring(0, i);
    			if (sub.length() > size / 2 + 1) {
    				break;
    			}
    			if (size % sub.length() != 0) {
    				flag = false;
    				continue;
    			} else {
    				flag = true;
    			}
    			for (int j = sub.length(); j < size; j+= sub.length()) {
    				if (!str.substring(j, j + sub.length()).equals(sub)) {
    					flag = false;
    				}
    			}
    			if (flag == true) {
    				break;
    			}
    		}
    	}
    	if (num == 0) {
    		return false;
    	}else {
        	return flag;
    	}

    }
//    public static void main(String args[]) {
//    	System.out.println(new Solution().repeatedSubstringPattern("ab"));
//    }
}