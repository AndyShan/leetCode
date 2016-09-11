package _396;

public class Solution {
    public int maxRotateFunction(int[] A) {
    	int max = Integer.MIN_VALUE;
    	int n = A.length;
    	for (int i = 0; i < n; i++) {
    		int re = fun(A,i);
    		if (re > max) {
    			max = re;
    		}
    	}
    	return max;
        
    }
    public int fun(int[] A,int a) {
    	int n = A.length;
    	int stop = n - a;
    	int index = 0;
    	int result = 0;
    	for (int i = stop; i < n ;i++) {
    		result += index * A[i];
    		index ++;
    	}
    	for (int i = 0; i < stop;i++) {
    		result += index * A[i];
    		index++;
    	}
    	return result;
    }
}