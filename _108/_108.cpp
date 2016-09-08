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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return toBST(nums, 0, nums.size() - 1);
    }

    TreeNode* toBST(vector<int>& nums, int left, int right) {
    	if (left > right || left < 0 || right = nums.size()) {
    		return NULL;
    	}

    	mid = left + (right - left) / 2;
    	TreeNode* root = new TreeNode(nums[mid]);
    	root->left = toBST(nums, left, mid - 1);
    	root->right = toBST(nums, mid + 1, right);
    	return root;

    }
};