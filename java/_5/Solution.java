package _5;

public class Solution {
	public String longestPalindrome(String s) {
		int max = 0;
		Pal pal = new Pal(0, 0);
		Pal res = pal;
		for (int i = 0; i < s.length(); i++) {
			pal = isPalindromic(s, i);
			if (pal.high - pal.low > max) {
				max = pal.high - pal.low;
				res = pal;
			}
		}
		return s.substring(res.low, res.high + 1);
	}

	private Pal isPalindromic(String s, int i) {		
		int l = i, h = i;
		while (h+1 < s.length() && s.charAt(i) == s.charAt(h+1)) {
			h++;
		}
		while (l-1 >= 0 && h+1 < s.length() && s.charAt(l-1) == s.charAt(h+1)) {
			l--;
			h++;
		}
		return new Pal(l, h);
	}
	class Pal {
		int low;
		int high;

		public Pal(int x, int y) {
			low = x;
			high = y;
		}
	}
	public static void main(String args[]) {
		System.out.println(new Solution().longestPalindrome("sfabbasdfabccbaweiweiof"));
	}
}
