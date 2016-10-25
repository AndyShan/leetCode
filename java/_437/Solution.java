package _437;

import java.util.ArrayList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public int pathSum(TreeNode root, int sum) {
    	if (root == null) {
    		return 0;
    	}
    	return find(root, sum) +pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    public int find(TreeNode root, int sum) {
    	int res = 0;
    	if (root == null) {
    		return res;
    	}
    	if (root.val == sum) {
    		res ++;
    	}
    	res += find(root.left, sum - root.val);
    	res += find(root.right, sum - root.val);
    	return res;
    }
}