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
int minDepth(TreeNode *root) 
{
    if (NULL == root)
        return 0;
    int l = minDepth(root->left);
    int r = minDepth(root->right);
    if (!l)
        return r+1;
    if (!r)
        return l+1;
    return l<r ? l+1 : r+1;
}
    
};