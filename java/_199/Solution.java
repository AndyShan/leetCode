package _199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	if (root == null) {
    		return res;
    	}
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while (! queue.isEmpty()) {
    		int size = queue.size();
    		while (size -- > 0) {
    			TreeNode node = queue.poll();
    			if (size == 0) {
    				res.add(node.val);
    			}
    			
    			if (node.left != null) {
    				queue.offer(node.left);
    			}
    			if (node.right != null) {
    				queue.offer(node.right);
    			}
    		}
    	}
    	return res;
    }
}