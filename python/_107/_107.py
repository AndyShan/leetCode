# Definition for a binary tree node.
import Queue
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        queue = []
        res = []
        if root == None:
            return res
        queue.append(root)
        while len(queue) != 0:
            level = len(queue)
            sub = []
            for i in range(level):
                if queue[0].left != None:
                    queue.append(queue[0].left)
                if queue[0].right != None:
                    queue.append(queue[0].right)
                sub.append(queue[0].val)
                queue.pop(0)
            res.insert(0,sub)
        return res