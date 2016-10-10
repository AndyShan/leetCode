package _415;

public class Solution {
	public String addStrings(String num1, String num2) {
		if (num1.length() >= num2.length()) {
			num2 = addString(num2, num1.length() - num2.length());
		} else {
			num1 = addString(num1, num2.length() - num1.length());
		}
		String res = "";
		int index = num1.length() - 1;
		boolean isAdd = false;
		int addnum = 0;
		
		while (index >= 0) {
			int r = Integer.valueOf(num1.charAt(index) + "") + Integer.valueOf(num2.charAt(index) + "") + addnum;
			if (r < 10) {
				res = r + res;
				index--;
				isAdd = false;
				addnum = 0;
				continue;
			} else {
				res = r % 10 + res;
				index--;
				addnum = r / 10;
				isAdd = true;
				continue;
			}

		}
		if (isAdd == true) {
			res = addnum + res;
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