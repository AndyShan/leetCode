package _151;

public class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split("\\s");
        StringBuilder sb = new StringBuilder("");
        for (int i = s1.length-1; i >= 0; i--) {
			if (!s1[i].trim().equals("")) {
    			sb.append(s1[i]);
	    		sb.append(' ');
			}
		}
        return sb.toString().trim();
    }
}