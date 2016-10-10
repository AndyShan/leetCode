package _15;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		int[] a = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = new Solution().threeSum(a);
		for (int i = 0;i<list.size();i++) {
			for (int j = 0;j<list.get(i).size();j++) {
				System.out.print(list.get(i).get(j));
			}
			System.out.println("");
		}
	}
}
