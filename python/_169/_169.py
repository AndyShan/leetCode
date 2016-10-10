class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        md = {}
        n = len(nums) / 2
        if n == 0:
            return nums[0]
        for i in nums:
            if md.has_key(i):
                md[i] += 1
                if md[i] > n:
                    return i
            else:
                md[i] = 1
                