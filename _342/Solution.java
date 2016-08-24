package _342;

public class Solution {
    public boolean isPowerOfFour(int num) {
    	String s = Integer.toBinaryString(num);
    	byte[] b =s.getBytes();
    	return !(b.length % 2 == 0);
    }
}