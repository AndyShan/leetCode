class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        if ransomNote == "":
            return True
        m_dict = {}
        for i in magazine:
            if m_dict.has_key(i):
                m_dict[i] += 1
            else:
                m_dict[i] = 1
        for i in ransomNote:
            if not m_dict.has_key(i):
                return False
            elif m_dict[i] == 0:
                return False
            else:
                m_dict[i] -= 1
        return True

if __name__ == "__main__":
    a = Solution()
    print a.canConstruct("aa","ab")
