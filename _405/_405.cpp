public class Solution {
    public String toHex(int num) {
        if (num == -2147483648) {
            return "80000000";
        }
    	if (num > 0) {
    		return binToHex(toBin(num));
    	} else if (num < 0){
    		return binToHex(binAddOne(toBin(num *= -1)));
    	} else {
    		return "0";
    	}
    }
    public String toBin(int num) {
    	String result = "";
    	while (num / 2 != 0) {
    		result = (num % 2) + result;
    		num /= 2;
    	}
		result = (num % 2) + result;
		if (result.length() < 32) {
			int cha = 32 - result.length();
			for (int i = 0; i < cha; i ++) {
				result = "0" + result;
			}
		}
    	return result;
    }
    public String binToHex(String bin) {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("0000", "0");
    	map.put("0001", "1");
    	map.put("0010", "2");
    	map.put("0011", "3");
    	map.put("0100", "4");
    	map.put("0101", "5");
    	map.put("0110", "6");
    	map.put("0111", "7");
    	map.put("1000", "8");
    	map.put("1001", "9");
    	map.put("1010", "a");
    	map.put("1011", "b");
    	map.put("1100", "c");
    	map.put("1101", "d");
    	map.put("1110", "e");
    	map.put("1111", "f");
    	String result = "";
    	for (int i = 0;i < 32; i+=4) {
    		String s = "";
    		for (int j = i; j < i+4; j++) {
    			s += bin.charAt(j);
    		}
    		result += map.get(s);
    	}
    	int index = 0;
    	while (result.charAt(index) == '0') {
    		index ++;
    	}
    	return result.substring(index);
    	
    }
    public String binAddOne(String bin) {
    	String s = "";
    	for (int i = 0; i < bin.length(); i++) {
    		if (bin.charAt(i) == '0') {
    			s += "1";
    		} else {
    			s += "0";
    		}
    	}
    	int index = 31;
    	String ss = "";
    	while (s.charAt(index) != '0') {
    		ss = "0" + ss;
    		index --;
    	}
    	ss = "1" + ss;
    	return s.substring(0,index) + ss;
    }
}