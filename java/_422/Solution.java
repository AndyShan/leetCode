package _422;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
        	int l = words.get(i).length();
        	for (int j = 0; j < l; j++) {
        		if (words.size() <= j) {
        			return false;
        		}
        		if ( words.get(j).length() <= i) {
        			return false;
        		}
        		if (words.get(i).charAt(j) != words.get(j).charAt(i)) {
        			return false;
        		}
        	}
        }
        return true;
    }
}