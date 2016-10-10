package _408;

public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
    	int wordl = word.length();
    	int abbrl = abbr.length();
    	int l = 0;
    	int abl = 0;
    	int index = 0;
    	if (abbrl == 0) {
    		return false;
    	}
    	if (abbr.charAt(0) == '0') {
    		return false;
    	}
    	while (index < abbrl) {
    		if (l == wordl) {
    			return false;
    		}
    		if (!Character.isDigit(abbr.charAt(index))) {
    			if (word.charAt(l) != abbr.charAt(index)) {
    				return false;
    			} else {
    				index ++;
    				l++;
    				abl++;
    			}
    		} else if (abbr.charAt(index) == '0') {
    			index += 1;
    			l += 1;
    		} else {
    			String num = "";
    			while (Character.isDigit(abbr.charAt(index))) {
    				num += abbr.charAt(index);
    				index ++;
    				if (index == abbrl) {
    					break;
    				}
    			}
    			l += Integer.valueOf(num);
    			abl += Integer.valueOf(num);
    		}
    	}
    	if (abl != wordl) {
    		return false;
    	} else {
        	return true;

    	}
    }
}