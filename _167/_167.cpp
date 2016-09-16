class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
    	int begin = 0;
    	int end = numbers.size() - 1;
    	int result = 0;
    	vector<int> v;
    	while (begin < end) {
    		result = numbers[begin] + numbers[end];
    		if (result < target) {
    			begin++;
    		} else if (result > target) {
    			end--;
    		} else {
    			v.push_back(begin + 1);
    			v.push_back(end + 1);
    			break;
       		}
    	}
    	return v;        
    }
};