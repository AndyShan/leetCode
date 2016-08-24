package _187;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> list = new LinkedList<String>();
		Set<String> result = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		char[] schar = s.toCharArray();
		if (schar.length < 10) {
			return list;
		} else {
			for (int i = 0; i < schar.length - 9; i++) {
				String ss = "";
				for (int j = i; j <= i + 9; j++) {
					ss += schar[j];
				}
				if (set.contains(ss)) {
					result.add(ss);
				}else {
					set.add(ss);
				}
			}
			list.addAll(result);
			return list;
		}
	}
}