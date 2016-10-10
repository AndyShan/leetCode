package _338;

public class Main {
	public static void main(String args[]) {
		int[] result = new Solution().countBits(5);
		for (int i : result) {
			System.out.println(i);
		}
	}
}

class Solution {
	public int[] countBits(int num) {
		int[] result = new int[num + 1];
		for (int i = 0;i<=num;i++) {
			
			result[i] = count(Integer.toBinaryString(i));
		}
		return result;
	}
	
	public int count(String binary) {
		int count = 0;
		char[] c = binary.toCharArray();
		for (char i : c) {
			if (i == '1') {
				count++;
			}
		}
		return count;
	}
}
