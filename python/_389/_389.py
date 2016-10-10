class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        if len(s) < 1:
            return t
        m_dic = {}
        for i in s:
            if m_dic.has_key(i):
                m_dic[i] = m_dic[i] + 1
            else:
                m_dic[i] = 1
        for i in t:
            if not m_dic.has_key(i):
                return i
            m_dic[i] = m_dic[i] - 1
            if (m_dic[i] < 0):
                return i