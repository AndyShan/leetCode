package _144;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	return res;
    }
    public void preorder(TreeNode root, List<Integer> res) {
    	if (root == null) {
    		return;
    	}
    	else {
        	res.add(root.val);
        	preorder(root.left, res);
        	preorder(root.right, res);
    	}
    }
}