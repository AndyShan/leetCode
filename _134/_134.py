class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        total = 0
        start = 0
        m_sum = 0
        for i in range(len(gas)):
            total += gas[i] - cost[i]
            if m_sum < 0:
                start = i
                m_sum = gas[i] - cost[i]
            else:
                m_sum += gas[i] - cost[i]
        if total < 0:
            return -1
        else:
            return start