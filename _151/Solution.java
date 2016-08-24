package _151;

public class Solution {
    public String reverseWords(String s) {
    	String m_s = s.trim();
    	char[] array = (" " + m_s).toCharArray();
    	int length = array.length;
    	String ss = "";
    	String sss = "";
    	for (int i = length - 1;i >= 0;i--) {
    		if (array[i] != ' ') {
    			sss += array[i];
    		}else if (!sss.equals("")) {
    			ss += new StringBuffer(sss).reverse().toString() + " ";
    			sss = "";
    		}
    	}
    	return ss.trim();
    }
//    public static void main(String args[]) {
//    	String s = "1    5 3";
//    	System.out.println(new Solution().reverseWords(s));
//    }
}