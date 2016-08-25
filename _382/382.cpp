/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
	ListNode* head;
public:
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    Solution(ListNode* head) {
		this->head = head;
    }
    
    /** Returns a random node's value. */
    int getRandom() {
		int count = 0, nodeVal = 0;
		ListNode* node = head;
		while (node) {
			if (rand() % (++count) == 0) {
				nodeVal = node->val;
			}
			node = node->next;
		}
		return nodeVal; 
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
