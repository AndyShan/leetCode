package _198;
public class Main{
	public static void main(String args[]) {
		int[] a = {0,0};
		System.out.println(new Solution().rob(a));
	}
}

class Solution {
	public int rob(int[] nums) {
		if (nums.length != 0 && nums != null && nums.length != 1) {
			int[] index = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				index[i] = i;
			}
			QuickSort.sort(nums, index);
			int in = 0;
			if (nums.length == 2) {
				for (int i : nums) {
					System.out.println(i);
				}
				return nums[0];
			} else {
				while (index[in] == index[in + 1] + 1 || index[in] == index[in + 1] - 1) {
					in++;
				}
				return nums[in] + nums[in + 1];
			}

		} else if (nums.length == 1) {
			return nums[0];
		} else {
			return 0;
		}

	}
}

class QuickSort {
	// static int index = 0;

	public static void sort(int[] nums, int[] index) {
		sort(nums, index, 0, nums.length - 1);
	}

	private static void sort(int[] nums, int[] index, int low, int high) {
		if (high < low) {
			return;
		}
		// index++;
		// System.out.println("\n�ָ��" + index + "��");
		int j = partition(nums, index, low, high);
		int k = j - 1;
		// System.out.println("�ݹ�������벿��" + " low:" + low + " j-1:" + k);
		sort(nums, index, low, j - 1);// �ݹ�������벿��
		int m = j + 1;
		// System.out.println("�ݹ�������벿��" + " j+1:" + m + " high:" + high);
		sort(nums, index, j + 1, high);// �ݹ������Ұ벿��
	}

	private static int partition(int[] nums, int[] index, int low, int high) {
		int i = low, j = high + 1;// ����ɨ��ָ��
		int v = nums[low];// �з�Ԫ��
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
			// System.out.println("����"+" i:"+i+" j:"+j);
			exch(nums, index, i, j);
		}
		// System.out.println("main����"+" i:"+i+" j:"+j);
		exch(nums, index, low, j);
		return j;
	}

	private static void exch(int[] nums, int[] index, int i, int j) {
		int swap = nums[i];
		int swap2 = index[i];
		nums[i] = nums[j];
		index[i] = index[j];
		nums[j] = swap;
		nums[j] = swap2;
	}

	private static boolean less(int v, int w) {
		return v < w;
	}
}
