package _221;

public class Solution {
	public int maximalSquare(char[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] ret = new int[row][col];
		int max = 0;
		// 初始化列
		for (int i = 0; i < row; i++) {
			if (matrix[i][0] == '1') {
				ret[i][0] = 1;
				max = 1;
			}
		}
		// 初始化行
		for (int i = 0; i < col; i++) {
			if (matrix[0][i] == '1') {
				ret[0][i] = 1;
				max = 1;
			}
		}
		//递推公式：f(x,y) = min(f(x-1)(y),f(x)(y-1),f(x-1)(y-1)) + 1
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][j] == '0') {
					ret[i][j] = 0;
				}else {
					ret[i][j] = Math.min(ret[i - 1][j], Math.min(ret[i][j - 1], ret[i - 1][j - 1])) + 1;
					max = Math.max(max, ret[i][j]);
				}
			}
		}
		return max * max;
	}
}