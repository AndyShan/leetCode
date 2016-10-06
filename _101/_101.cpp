/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if (root == NULL) {
        	return true;
        }
        return mySymmetric(root->left, root->right);
    }

    bool mySymmetric(TreeNode* left, TreeNode* right) {
    	if (left != NULL && right != NULL && left->val == right->val) {
    		return mySymmetric(left->left,right->right) && mySymmetric(left->right,right->left);
    	} else if (left == NULL && right == NULL){
    		return true;
    	} else {
    		return false;
    	}
    }
};