package _350;

import java.util.LinkedList;

public class Main {
	public static void main(String args[]) {
		int[] a = {8,0,3};
		int[] b = {0,0};
		int[] list = new Solution().intersect(a, b);
		for (int i : list) {
			System.out.println(i);
		}
	}
}
