package _417;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public static final int[][] DIR = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public List<int[]> pacificAtlantic(int[][] matrix) {
		List<int[]> res = new ArrayList<>();
		if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
			return res;
		}
		int n = matrix.length;
		int m = matrix[0].length;
		boolean[][] pacific = new boolean[n][m];
		boolean[][] atlantic = new boolean[n][m];
		Queue<int[]> pQueue = new LinkedList<>();
		Queue<int[]> aQueue = new LinkedList<>();
		// 将边界入队
		for (int i = 0; i < n; i++) {
			pQueue.offer(new int[] { i, 0 });
			aQueue.offer(new int[] { i, m - 1 });
			pacific[i][0] = true;
			atlantic[i][m - 1] = true;
		}
		for (int i = 0; i < m; i++) {
			pQueue.offer(new int[] { 0, i });
			aQueue.offer(new int[] { n - 1, i });
			pacific[0][i] = true;
			atlantic[n - 1][i] = true;
		}
		bfs(matrix, pQueue, pacific);
		bfs(matrix, aQueue, atlantic);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (pacific[i][j] && atlantic[i][j]) {//如果从两个边界都可以搜索到，那么该点可以有水连通。
					res.add(new int[] { i, j });
				}
			}
		}

		return res;
	}

	public void bfs(int[][] matrix, Queue<int[]> queue, boolean[][] isVisited) {
		int n = matrix.length;
		int m = matrix[0].length;
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			for (int[] d : DIR) {
				int x = cur[0] + d[0];
				int y = cur[1] + d[1];
				if (x < 0 || x >= n || y < 0 || y >= m || isVisited[x][y] || matrix[x][y] < matrix[cur[0]][cur[1]]) {
					continue;
				}
				isVisited[x][y] = true;
				queue.offer(new int[] { x, y });
			}
		}
	}
}