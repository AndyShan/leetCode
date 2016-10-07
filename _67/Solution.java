package _67;

public class Solution {
    public String addBinary(String a, String b) {
    	String ss;
    	String ls;
    	if (a.length() >= b.length()) {
    		b = addString(b, a.length() - b.length());
    	} else {
    		a = addString(a, b.length() - a.length());
    	}
    	String res = "";
    	int index = 0;
    	boolean isAdd = false;
    	while (index < a.length()) {
    		if (!isAdd) {
    			if (a.charAt(index) == '0' && b.charAt(index) == '0') {
    				res = "0" + res;
    				index ++;
    				continue;
    			} else if (a.charAt(index) == '1' && b.charAt(index) == '1'){
    				res = "0" + res;
    				index ++;
    				isAdd = true;
    				continue;
    			} else {
    				res = "1" + res;
    				index++;
    				continue;
    			}
    		} else {
    			if (a.charAt(index) == '0' && b.charAt(index) == '0') {
    				res = "1" + res;
    				index ++;
    				isAdd = false;
    				continue;
    			} else if (a.charAt(index) == '1' && b.charAt(index) == '1'){
    				res = "1" + res;
    				index ++;
    				isAdd = true;
    				continue;
    			} else {
    				res = "0" + res;
    				isAdd = true;
    				index++;
    				continue;
    			}
    		}
    	}
    	return res;
    }
    public String addString(String shortNum, int num) {
    	int index = 0;
    	String res = shortNum;
    	while (index < num) {
    		res = "0" + res;
    		index++;
    	}
    	return res;
    }
}