package _401;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int num) {
    	List<String> list = new ArrayList<>();
    	int[] codetime = new int[10];
    	dfs(codetime, 0, 0, list, num);
    	return list;
    }
    public void dfs(int[] codetime, int i, int k, List<String> list, int num) {
    	if (k == num) {
    		String result = decodeToTime(codetime);
    		if (result != null) {
    			list.add(result);
    		}
    		return;
    	}
    	if (i == codetime.length) {
    		return;
    	}
    	codetime[i] = 1;
    	dfs(codetime, i + 1, k + 1, list, num);
    	codetime[i] = 0;
    	dfs(codetime, i + 1, k, list, num);
    }
    public String decodeToTime(int[] codetime) {
    	int hours = 0;
    	for (int i = 0; i < 4; i++) {
    		if (codetime[i] == 1) {
    			hours += (int)Math.pow(2, i);
    		}
    	}
    	int minutes = 0;
    	for (int i = 4; i < 10; i++) {
    		if (codetime[i] == 1) {
    			minutes += (int)Math.pow(2, i - 4);
    		}
    	}
    	String min = minutes + "";
    	if (minutes < 10) {
    		min = "0" + minutes;
    	}
    	if (hours > 12 || minutes > 60) {
    		return null;
    	}
    	return hours + ":" + min;
    }
}