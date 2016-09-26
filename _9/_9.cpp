class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        s = str(x)
        length = len(s)
        if length % 2 != 0:
            ll = length / 2
            i = ll - 1
            j = ll + 1
            while i >=0 and j < length:
                if s[i] == s[j]:
                    i -= 1
                    j += 1
                else:
                    return False
            
        elif length % 2 == 0:
            j = length / 2
            i = j - 1
            while i >= 0 and j< length:
                if s[i] == s[j]:
                    i -= 1
                    j += 1
                else:
                    return False
        return True
            
            
            