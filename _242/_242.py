class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_d = {}
        s_n = len(s)
        t_n = len(t)
        for i in s:
            if not s_d.has_key(i):
                s_d[i] = 1
            else:
                s_d[i] += 1

        for i in t:
            if not s_d.has_key(i):
                return False
            else:
                s_d[i] -= 1
                if s_d[i] < 1:
                    del s_d[i]

        if len(s_d) == 0:
            return True
        else:
            return False
