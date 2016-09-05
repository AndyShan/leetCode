package _393;


public class Solution {
	public boolean validUtf8(int[] data) {
		int n = data.length;
		int[] re = 	process(data);
		int mark = 0;
		for (int i = 0; i < n; i++) {
			if (mark != 0) {
				if (re[i] != 1) {
					return false;
				} else {
					mark --;
				}
			} else {
				mark = re[i];
			}
		}
		if (mark == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int[] process(int[] data) {
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			String re = Integer.toBinaryString(data[i]);
			int n = re.length();
			String s = "";
			if (n < 8) {
				for (int j = 0;j<8 - n;j++) {
					s += "0";
				}
			}
			String ss = s + re;
			int mark = 0;
			for (int j = 0; j < 4; j++) {
				if (ss.charAt(j) == '0') {
					break;
				} else {
					mark ++;
				}
				
			}
			if (mark > 1) {
				mark --;
			}
			result[i] = mark;
		}
		return result;
	}
}