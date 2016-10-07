package _67;

public class Solution {
	public String addBinary(String a, String b) {
		if (a.length() >= b.length()) {
			b = addString(b, a.length() - b.length());
		} else {
			a = addString(a, b.length() - a.length());
		}
		String res = "";
		int index = a.length() - 1;
		boolean isAdd = false;
		while (index >= 0) {
			if (!isAdd) {
				if (a.charAt(index) == '0' && b.charAt(index) == '0') {
					res = "0" + res;
					index--;
					continue;
				} else if (a.charAt(index) == '1' && b.charAt(index) == '1') {
					res = "0" + res;
					index--;
					isAdd = true;
					continue;
				} else {
					res = "1" + res;
					index--;
					continue;
				}
			} else {
				if (a.charAt(index) == '0' && b.charAt(index) == '0') {
					res = "1" + res;
					index--;
					isAdd = false;
					continue;
				} else if (a.charAt(index) == '1' && b.charAt(index) == '1') {
					res = "1" + res;
					index--;
					isAdd = true;
					continue;
				} else {
					res = "0" + res;
					isAdd = true;
					index--;
					continue;
				}
			}
		}
		if (isAdd == true) {
			res = "1" + res;
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