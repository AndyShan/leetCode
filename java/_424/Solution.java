package _424;

public class Solution {
	public int characterReplacement(String s, int k) {
		int l = s.length();
		int[] count = new int[26];
		int start = 0;
		int max = 0;
		int res = 0;
		for (int end = 0; end < l; end++) {
			max = Math.max(max, ++count[s.charAt(end) - 'A']);
			while (end - start + 1 - max > k) {
				count[s.charAt(start) - 'A']--;
				start++;
			}
			res = Math.max(res, end - start + 1);
		}
		return res;
	}
}