public:
int height(TreeNode* root) {
	if (root == NULL) {
		return 0;
	}
	int l = height(root->left);
	int r = height(root->right);
	if (l < 0 || r < 0 || abs(l - t) > 1) {
		return -1;
	} else {
		return max(l,r) + 1;
	}
}

bool isBalanced(TreeNode* root) {
	if (root == NULL) {
		return true;
	}
	int l = height(root->left);
	int r = height(root->right);
	if (l < 0 || r < 0 || abs(l - r) > 1) {
		return false;
	}
	return true;
}