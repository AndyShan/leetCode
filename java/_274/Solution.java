package _274;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
    if (citations == null || citations.length == 0) {return 0;}
    
    Arrays.sort(citations);
    int len = citations.length, h = 0;

    for (int i = len - 1; i >= 0; i--) {
        if (citations[i] >= len - i) {
           h++;
        }
    }
    return h;
}}
