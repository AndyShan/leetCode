struct Node
{
	int x, y;
}node;
struct cmp
{
	bool operator()(Node a,Node b) {
		return (a.x + a.y) > (b.x + b.y);
	}
};
class Solution {
public:
    vector<pair<int, int>> kSmallestPairs(vector<int>& nums1, vector<int>& nums2, int k) {
    	priority_queue<Node,vector<Node>,cmp>q;
    	for (int i = 0; i < nums1.size();i++) {
    		for (int j = 0; j < nums2.size(); j++) {
    			node.x = nums1[i];
    			node.y = nums2[j];
    			q.push(node);
    		}
    	}
    	vector<pair<int, int>>result;
    	int index = 0;
    	while(!q.empty() && index < k) {
    		int a = q.top().x;
    		int b = q.top().y;
    		q.pop();
    		result.push_back(make_pair(a,b));
    		index++;
    	}
    	return result;
    }

};