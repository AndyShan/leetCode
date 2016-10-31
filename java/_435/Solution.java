package _435;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class Solution {
	public int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.end - o2.end;
			}
		});
		int length = intervals.length;
		int count = 1;
		int last = 0;
		for (int i = 1; i < length; i++) {
			if (intervals[last].end <= intervals[i].start) {
				count ++;
				last = i;
			}
		}
		return length - count;
		
	}
}