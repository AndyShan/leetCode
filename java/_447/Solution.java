package _447;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public int numberOfBoomerangs(int[][] points) {
		int res = 0;
		if (points == null || points.length <= 0) {
			return res;
		}
		int size = points.length;
		for (int i = 0; i < size; i++) {
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < size; j++) {
				int dis = (int) (Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
				if (!map.containsKey(dis)) {
					map.put(dis, 0);
				}
				res += map.get(dis) * 2;
				map.put(dis, map.get(dis) + 1);
			}
		}
		return res;
	}
}