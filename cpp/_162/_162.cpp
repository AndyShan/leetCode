#include <string>
#include <iostream>
#include <cstdlib>
#include <vector>
using std::cout;
using std::endl;
using std::vector;
class Solution {
public:
    int findPeakElement(vector<int>& nums) {
    	int n = nums.size();
    	if (n <= 2) {
    		if (n == 1) {
    			return 0;
    		} else {
    			if (nums[0] > nums[1]) {
    				return 0;
    			} else {
    				return 1;
    			}
    		}
    	}
    	if (nums[0] > nums[1]) {
    		return 0;
    	}
    	if (nums[n - 1] > nums[n - 2]) {
    		return n - 1;
    	}
    	int i = 0;
    	for (i = 1; i < n - 1 ; ++i) {
    		if (nums[i] > nums[i - 1] && nums[i] > nums [i + 1]) {
    			break;
    		}
    	}
    	return i;
    }
};

int main() {
	Solution s;
	vector<int> v;
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);
	v.push_back(1);

	int a = s.findPeakElement(v);
	cout << a << endl;
	system("pause");
	return 0;
}