package _130;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public void solve(char[][] board) {
		if(board == null || board.length == 0 || board[0].length == 0)
            return;
        for(int i = 0; i < board[0].length; i ++) {
            fill(board, 0, i);
            fill(board, board.length - 1, i);
        }
        for(int i = 0; i < board.length; i ++) {
            fill(board, i, 0);
            fill(board, i, board[0].length - 1);
        }
        for(int i = 0; i < board.length; i ++) {
            for(int j = 0; j < board[0].length; j ++) {
                if(board[i][j] == '#')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
	}

	public void fill(char[][] board, int i, int j) {
		if (board[i][j] != 'O') {
			return;
		}
		board[i][j] = '#';
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i,j});
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size > 0) {
				size --;
				int[] pos = queue.poll();
				if (pos[0] + 1 < board.length && board[pos[0] + 1][pos[1]] == 'O') {
					board[pos[0] + 1][pos[1]] = '#';
					queue.offer(new int[]{pos[0] + 1, pos[1]});
				}
				if (pos[0] - 1 >= 0 && board[pos[0] - 1][pos[1]] == 'O') {
					board[pos[0] - 1][pos[1]] = '#';
					queue.offer(new int[]{pos[0] - 1, pos[1]});
				}
				if (pos[1] + 1 < board[0].length && board[pos[0]][pos[1] + 1] == 'O') {
					board[pos[0]][pos[1] + 1] = '#';
					queue.offer(new int[]{pos[0], pos[1] + 1});
				}
				if (pos[1] - 1 >= 0 && board[pos[0]][pos[1] - 1] == 'O') {
					board[pos[0]][pos[1] - 1] = '#';
					queue.offer(new int[]{pos[0], pos[1] - 1});
				}
			}
		}
	}
}