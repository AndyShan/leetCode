/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
         if (root != null) 
        {
            if (isLeaf(root.left))
                res += root.left.val;
            else // Else recur for left child of root
                res += sumOfLeftLeaves(root.left);
 
            // Recur for right child of root and update res
            res += sumOfLeftLeaves(root.right);
        }
 
        // return result
        return res;

    }
    public boolean isLeaf(TreeNode node) 
    {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
        return false;
    }
}