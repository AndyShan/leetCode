package _394;

import java.util.Stack;

public class Solution {
	public String decodeString(String s) {
		Stack<String> num = new Stack<>();
		Stack<String> sym = new Stack<>();
		Stack<String> str = new Stack<>();
		int index = 0;
		int n = s.length();
		if (n == 0) {
			return "";
		}
		String curStr = "";
		String curStr2 = "";
		String curnum = "";
		
		while (index < n) {
			while (Character.isLetter(s.charAt(index))) {
				curStr += s.charAt(index);
				index++;
				if (index == n) {
					break;
				}
			}
			if (curStr != "") {
				if (sym.size() > 0) {
					str.push(curStr);
					curStr = "";
				} else if (str.size() > 0){
					str.push(str.pop() + curStr);
					curStr = "";
				} else {
					str.push(curStr);
					curStr = "";
				}

			}
			if (index == n) {
				break;
			}
			while (Character.isDigit(s.charAt(index))) {
				curnum += s.charAt(index);
				index++;
			}
			if (curnum != "") {
				num.push(curnum);
				curnum = "";
			}
			if (s.charAt(index) == '[') {
				sym.push("[");
			}
			if (s.charAt(index) == ']') {
				sym.pop();
				int nums = Integer.valueOf(num.pop());
				String strs = str.pop();
				while (nums > 0) {
					curStr2 += strs;
					nums --;
				}
				if (str.size() > 0) {
					str.push(str.pop() + curStr2);
					curStr2 = "";
				} else {
					str.push(curStr2);
					curStr2 = "";
				}
			}
			index ++;
		}
		return str.pop();
	}
}