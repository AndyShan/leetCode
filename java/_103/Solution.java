package _103;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new LinkedList<List<Integer>>();
    	if (root == null) {
    		return res;
    	}
    	List<TreeNode> list = new LinkedList<>();
    	list.add(root);
    	int flag = 0;
    	while (!list.isEmpty()) {
        	int size = list.size();
        	if (flag == 0) {
        		List<Integer> cur = new LinkedList<>();
        		int index = size - 1;
        		while (size > 0) {
        			size --;
        			TreeNode curNode = list.get(index);
        			list.remove(index);
        			cur.add(curNode.val);
        			if (curNode.left != null) {
        				list.add(curNode.left);
        			}
        			if (curNode.right != null) {
        				list.add(curNode.right);
        			}
        			index--;
        		}
        		res.add(cur);
        		flag = 1;
        	} else if (flag == 1) {
        		List<Integer> cur = new LinkedList<>();
        		int index = size - 1;
        		while (size > 0) {
        			size--;
        			TreeNode curNode = list.get(index);
        			list.remove(index);
        			cur.add(curNode.val);
        			if (curNode.right != null) {
        				list.add(curNode.right);
        			}
        			if (curNode.left != null) {
        				list.add(curNode.left);
        			}
        			index--;
        		}
        		res.add(cur);
        		flag = 0;
        	}
    	}
    	return res;
    }
}