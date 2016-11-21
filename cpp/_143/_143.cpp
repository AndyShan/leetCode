struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
class Solution {
public:
    void reorderList(ListNode* head) {
    	if (head == NULL || head -> next == NULL) {
    		return;
    	}
    	ListNode *fast = head;
    	ListNode *slow = head;
    	ListNode *p;
    	ListNode *q;
    	while (fast->next != NULL && fast->next->next != NULL) {
    		fast = fast->next->next;
    		slow = slow->next;
    	}   
    	fast = slow -> next;
    	slow -> next = NULL;
    	p = fast;
    	q = fast -> next;
    	fast -> next = NULL;
    	while (q != NULL) {
    		ListNode *temp = q -> next;
    		q -> next = p;
    		p = q;
    		q = temp;
    	}
    	q = head;
    	while (q != NULL && p != NULL) {
    		ListNode *tem1 = q -> next;
    		ListNode *tem2 = p -> next;
    		p -> next = q -> next;
    		q -> next = p;
    		q = tem1;
    		p = tem2;
    	}
    }
};