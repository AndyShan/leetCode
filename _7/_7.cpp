class Solution {
public:
    int reverse(int x) {
    	int type = 1;
    	int y = x;
    	while (y / 10 != 0) {
    		type++;
    		y /= 10;
    	}
    	int result = 0;
    	for (int i = type - 1; i >= 0; i--) {
    		int tmp = x / pow(10,i);
    		result += tmp * pow(10,type - 1 - i);
    		x -= tmp * pow(10,i);
    	}
    	if (result <= -2147483648 || result >= 2147483647) {
    		return 0;
    	}
    	return result;   
    }
};