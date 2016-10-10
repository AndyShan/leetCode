struct node {
	int n,h,v;
	bool operator(const node & a) {
		if (n == a.n) {
			return h < a.h;
		}
		return n < a.n;
	}
};
class Solution {
	public:
		vector<pair<int, int>> reconstructQueue(vector<pair<int, int>>& people) {
			vector<pair<int, int>> res;
			int n = people.size();
			if (n < 2) {
				return people;
			}
			vector<node> v;
			for (auto p : people) {
				v.push_back({p.first(),p.second(),p.second()});
			}
			sort(v.begin(),v.end());
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < v.size(); j++) {
					if (v[j].h <= v[0].h) {
						v[j].n --;
					}
				}
				res.push_back({v[0].h,v[0].v});
				v.erase(v.begin());
				sort(v.begin(),v.end());
			}
			return res;
		}
}