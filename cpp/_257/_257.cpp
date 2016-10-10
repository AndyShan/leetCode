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
    void dfs(TreeNode* root, string cur, vector<string>& ans) {
    	if (cur == "") {
    		cur += to_string(root->val);
    	} else {
    		cur += "->" + to_string(root->val);
    	}
    	if (!root->left && !root->right) {
    		ans.push_back(cur);
    	}
    	if (root->left) {
    		dfs(root->left, cur, ans);
    	}
    	if (root->right) {
    		dfs(root->right, cur, ans);
    	}
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> ans;
        if (!root) {
        	return ans;
        }
        dfs(root, "", ans);
        return ans;
    }
};