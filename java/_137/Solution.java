package _137;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i : nums) {
        	if (map.containsKey(i)) {
        		map.put(i, map.get(i) + 1);
        	}else {
        		map.put(i, 1);
        	}
        	if (map.get(i) == 3) {
        		map.remove(i);
        	}
        }
        Iterator it = map.keySet().iterator();
        int key= 0;
        while (it.hasNext()) {
        	 key = (int) it.next();
        }
        return key;
    }
}