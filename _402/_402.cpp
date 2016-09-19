class Solution {
public:
    string removeKdigits(string num, int k) {
        if (num.size() <= k) {
        	return "0";
        }
        if (k <= 0) {
        	return num;
        }
        while (k-- > 0) {
        	int i = 0;
        	for (; i < num.size() - 1;++i) {
        		if (num[i + 1] < num[i]) {
        			break;
        		}
        	}
        	num.erase(i,1);
        	i = 0;
        	for (;i < num.size();++i) {
        		if (num[i] != '0') {
        			break;
        		}
        	}
        	if (i == num.size()) {
        		return "0";
        	}
        	if (i > 0) {
        		num.erase(0,i);
        	}
        }
        return num;
    }
};