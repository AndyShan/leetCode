package _451;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {
	public String frequencySort(String s) {
    	HashMap<String, Integer> map = new HashMap<>();
    	for (int i = 0; i < s.length(); i++) {
    		if (!map.containsKey(s.charAt(i) + "")) {
    			map.put(s.charAt(i) + "", 1);
    		} else {
    			map.put(s.charAt(i) + "", map.get(s.charAt(i) + "") + 1);
    		}
    	}
    	PriorityQueue<Entry<String, Integer>> queue = new PriorityQueue<>(new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				return arg0.getValue() - arg1.getValue();
			}
		});
    	for (Entry<String, Integer> entry : map.entrySet()) {
    		queue.add(entry);
    	}
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
        	Entry<String, Integer> e = queue.poll();
        	for (int i = 0; i < e.getValue(); i++) {
                sb.append(e.getKey());
        	}
        }
        return sb.toString();
    }
}
