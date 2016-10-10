package _15;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int x = nums[i];
			System.out.println(x);
			int y = i + 1;
			int z = nums.length - 1;
			while (y < z) {
				int sum = x + nums[y] + nums[z];
				if (sum == 0) {
					String s = x + nums[y] + "";
					if (!map.containsKey(s)) {
						map.put(s, 1);
						List<Integer> list = new LinkedList<Integer>();
						list.add(x);
						list.add(nums[y]);
						list.add(nums[z]);
						result.add(list);
						y++;
						z--;
					}else {
						y++;
						z--;
					}

				} else if (sum < 0) {
					y++;
				} else {
					z--;
				}
			}
		}
		return result;
	}

	/*
	 * quick sort
	 */
	public static void sort(int[] nums) {
		if (nums == null) {
			return;
		}
		sort(nums, 0, nums.length - 1);
	}

	private static void sort(int[] nums, int low, int high) {
		if (high < low) {
			return;
		}
		int j = partition(nums, low, high);
		int k = j - 1;
		sort(nums, low, j - 1);// �ݹ�������벿��
		int m = j + 1;
		sort(nums, j + 1, high);// �ݹ������Ұ벿��
	}

	private static int partition(int[] nums, int low, int high) {
		int i = low, j = high + 1;// ����ɨ��ָ��
		Comparable v = nums[low];// �з�Ԫ��
		while (true) {// ָ��ѭ�����ң�ֱ������ָ���غ�
			while (i < high && less(nums[++i], v)) {// ��ָ�����Ҳ��ұ��з�Ԫ��a[o]С��Ԫ��
				if (i == high) {
					break;
				}
			}
			while (j > low && less(v, nums[--j])) {// ��ָ��������ұ��з�Ԫ��a[o]С��Ԫ��
				if (j == low) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			exch(nums, i, j);
		}
		exch(nums, low, j);
		return j;
	}

	private static void exch(int[] nums, int i, int j) {
		int swap = nums[i];
		nums[i] = nums[j];
		nums[j] = swap;
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
}