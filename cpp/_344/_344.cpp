class Solution {
public:
    string reverseString(string s) {
    	string result = s;
    	int length = s.size();
    	if (length <= 0) {
			return result;    		
    	}
    	int i = 0;
    	int j = length - 1;
    	while (i < j) {
    		char temp = result[i];
    		result[i] = result[j];
    		result[j] = temp;
    		i++;
    		j--;
    	}
    	return result;
    }
};
