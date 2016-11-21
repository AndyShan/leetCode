package _463;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int islandPerimeter(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		Queue<int[]> queue = new LinkedList<>();
		int[][] isvisted = new int[grid.length][grid[0].length];
		int indexi = 0;
		int indexj = 0;
		boolean breakF = false;
		for (indexi = 0; indexi < grid.length; indexi++) {
			for (indexj = 0; indexj < grid[0].length; indexj ++) {
				if (grid[indexi][indexj] == 1) {
					breakF = true;
					break;
				}
			}
			if (breakF == true) {
				break;
			}
		}
		queue.offer(new int[] { indexi, indexj });
		isvisted[indexi][indexj] = 1;
		int res = 0;
		while (!queue.isEmpty()) {
			int flag = queue.size();
			while (flag > 0) {
				flag --;
				int[] cur = queue.poll();
				int i = cur[0];
				int j = cur[1];
				int bian = 0;
				if (i - 1 >= 0 && grid[i - 1][j] == 1) {
					bian += 1;
					if (isvisted[i - 1][j] == 0) {
						queue.offer(new int[]{i - 1, j});
						isvisted[i - 1][j] = 1;
					}
				}
				if (i + 1 < grid.length && grid[i + 1][j] == 1) {
					bian += 1;
					if (isvisted[i + 1][j] == 0) {
						queue.offer(new int[]{i + 1, j});
						isvisted[i + 1][j] = 1;
					}
				}
				if (j - 1 >= 0 && grid[i][j - 1] == 1) {
					bian += 1;
					if (isvisted[i][j - 1] == 0) {
						queue.offer(new int[]{i, j - 1});
						isvisted[i][j - 1] = 1;
					}
				}
				if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
					bian += 1;
					if (isvisted[i][j + 1] == 0) {
						queue.offer(new int[]{i, j + 1});
						isvisted[i][j + 1] = 1;
					}
				}
				res += (4 - bian);
			}
		}
		return res;
	}
}