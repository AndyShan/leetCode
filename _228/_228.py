class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        re = []
        if len(nums) == 0:
            return re
        begin = nums[0]
        end = nums[0]
        for i in range(1,len(nums)):
            if nums[i] - 1 == nums[i - 1]:
                end += 1
            else:
                if begin != end:
                    re.append(str(begin) + "->" + str(end))
                else:
                    re.append(str(begin))
                begin = nums[i]
                end  = nums[i]
        if begin != end:
            re.append(str(begin) + "->" + str(end))
        else:
            re.append(str(begin))
        return re


if __name__ == "__main__":
    a = [ 1, 2, 4, 5, 7]
    c = Solution()
    b = c.summaryRanges(a)
    print b