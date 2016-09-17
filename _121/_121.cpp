class Solution {
public:
    int maxProfit(vector<int>& prices) {
    	int maxPrice = 0;
    	int minPrice = INT_MAX;
    	for (int i = 0; i < prices.size(); i++) {
    		if (prices[i] < minPrice) {
    			minPrice = prices[i];
    		}
    		maxPrice = max(maxPrice,prices[i] - minPrice);
    	}
    	return maxPrice;        
    }
};