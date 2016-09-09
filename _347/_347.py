class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        numset = {}
        for i in nums:
            if numset.has_key(i):
                numset[i]+=1
            else:
                numset[i]=1
        res = sorted(numset.iteritems(), key=lambda d:d[1], reverse = True)
        print res
        result=[]
        for i in range(len(res)):
            if i == k:
                break
            result.append(res[i][0])
        return result