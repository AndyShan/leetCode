package _350;

import java.util.LinkedList;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        sort(nums1);
		sort(nums2);
		int[] result;
		LinkedList<Integer> list = Intersection(nums1, nums2);
		if (list != null && list.size() !=0) {
		result = new int[list.size()];
		int index = 0;
		for (int i : list) {
			result[index] = i;
			index++;
		}
		return result;
		}
		else {
		    result = new int[0];
		    return result;
		}

    }
    public static LinkedList<Integer> Intersection(int[] id1, int[] id2) {
			if (id1 == null || id2 == null || id1.length == 0 || id2.length == 0) {
				return null;
			}
			LinkedList<Integer> list = new LinkedList<Integer>();
			int point1 = 0;
			int point2 = 0;
			System.out.println("id1");
			for (int i : id1) {
				System.out.println(i);
			}
			System.out.println("id2");
			for (int i : id2) {
				System.out.println(i);
			}
			while (point1 < id1.length && point2 < id2.length) {
				if (id1[point1] < id2[point2]) {
					System.out.println("id1[point1] < id2[point2]");
					point1++;
				} else if (id1[point1] > id2[point2]) {
					System.out.println("id1[point1] > id2[point2]");
					point2++;
				} else {
					System.out.println("add");
					list.add(id1[point1]);
					point1++;
					point2++;
				}
			}
			return list;
		}
		
		/*
		 * quick sort
		 */
		public static void sort(int[] a) {
			if (a == null) {
				return;
			}
			sort(a, 0, a.length - 1);
		}
	
		private static void sort(int[] a, int low, int high) {
			if (high < low) {
				return;
			}
			int j = partition(a, low, high);
			int k = j - 1;
			sort(a, low, j - 1);// 递归排序左半部分
			int m = j + 1;
			sort(a, j + 1, high);// 递归排序右半部分
		}
	
		private static int partition(int[] a, int low, int high) {
			int i = low, j = high + 1;// 左右扫描指针
			Comparable v = a[low];// 切分元素
			while (true) {// 指针循环查找，直到左右指针重合
				while (i < high && less(a[++i], v)) {// 左指针向右查找比切分元素a[o]小的元素
					if (i == high) {
						break;
					}
				}
				while (j > low && less(v, a[--j])) {// 右指针向左查找比切分元素a[o]小的元素
					if (j == low) {
						break;
					}
				}
				if (i >= j) {
					break;
				}
				exch(a, i, j);
			}
			exch(a, low, j);
			return j;
		}
	
		private static void exch(int[] a, int i, int j) {
			int swap = a[i];
			a[i] = a[j];
			a[j] = swap;
		}
	
		private static boolean less(Comparable v, Comparable w) {
			return v.compareTo(w) < 0;
		}
	
}