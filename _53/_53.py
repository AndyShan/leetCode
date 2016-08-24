class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m_sum = 0
        max_sum = -1
        for i in nums:
            if m_sum >= 0:
                m_sum += i
            else:
                m_sum = i
            if m_sum > max_sum:
                max_sum = m_sum
        return max_sum

if __name__ == "__main__":
    a = [-2,-1]
    s = Solution()
    re = s.maxSubArray(a)
    print re

