class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman_dict = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        result = 0
        i = 0
        while i < len(s) - 1:
            if (roman_dict[s[i]] < roman_dict[s[i + 1]]):
                result += roman_dict[s[i + 1]] - roman_dict[s[i]]
                i+=2
            else:
                result += roman_dict[s[i]]
                i+=1
        if i == 0:
            return roman_dict[s[0]]
        if i == len(s) - 1:
            result += roman_dict[s[i]]
        return result
