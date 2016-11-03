package _109;

import java.util.ArrayList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    	ArrayList<Integer> array = new ArrayList<>();
    	ListNode curNode = head;
    	if (head == null) {
    		return null;
    	}
    	array.add(curNode.val);
    	while (curNode.next != null) {
    		curNode = curNode.next;
    		array.add(curNode.val);
    	}
    	return toBST(array, 0, array.size() - 1);
    }
    
    public TreeNode toBST(ArrayList<Integer> nums, int left, int right) {
    	if (left > right || left < 0 || right == nums.size()) {
    		return null;
    	}
    	
    	int mid = left + (right - left) / 2;
    	TreeNode node = new TreeNode(nums.get(mid));
    	node.left = toBST(nums, left, mid - 1);
    	node.right = toBST(nums, mid + 1, right);
    	return node;
    }
}