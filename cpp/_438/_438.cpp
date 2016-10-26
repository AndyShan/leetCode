class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
    	int sLength = s.size();
    	int pLength = p.size();
    	vector<int> hash1(26);
    	vector<int> hash2(26);
    	vector<int> res;
    	for (int i = 0 ; i < pLength; i++) {
    		hash1[p[i] - 'a'] ++;
    	}        
    	for (int i = 0; i < sLength; i++) {
    		hash2[s[i] - 'a'] ++;
    		if (i >= pLength) {
    			hash2[s[i - pLength] - 'a'] --;
    		}
    		if (hash1 == hash2) {
    			res.push_back(i + 1 - pLength)
    		}
    	}
    	return res;
    }
};