package _107;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return res;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> sub = new LinkedList<>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				sub.add(queue.poll().val);
			}
			res.add(0, sub);
		}
		return res;
	}
}