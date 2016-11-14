package _454;

import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	int res = 0;
    	HashMap<Integer, Integer> mapAB = new HashMap<Integer, Integer>();
    	HashMap<Integer, Integer> mapCD = new HashMap<Integer, Integer>();
    	for (int i = 0; i < A.length; i++) {
    		for (int j = 0; j < B.length; j++) {
    			if (mapAB.containsKey(A[i] + B[j])) {
    				mapAB.put(A[i] + B[j], mapAB.get(A[i] + B[j]) + 1);
    			} else {
        			mapAB.put(A[i] + B[j], 1);
    			}
    			if (mapCD.containsKey(C[i] + D[j])) {
    				mapCD.put(C[i] + D[j], mapCD.get(C[i] + D[j]) + 1);
    			} else {
    				mapCD.put(C[i] + D[j], 1);
    			}
    		}
    	}
    	
    	for (Integer key : mapAB.keySet()) {
    		if (mapCD.containsKey(-key)) {
    			res += mapAB.get(key) * mapCD.get(-key);
    		}
    	}
    	return res;
    }
}