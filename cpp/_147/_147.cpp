 struct ListNode {
	int val;
	ListNode *next;
	ListNode(int x) : val(x), next(NULL) {}
 };
 
class Solution {
public:
    ListNode* insertionSortList(ListNode* head) {
    	ListNode *root = new ListNode(0);
    	root->next = head;
    	ListNode *p = head;
    	ListNode *q;
    	ListNode *r;
    	while (p != NULL && p->next != NULL) {
    		if ( p->val <= p->next->val) {
    			p = p->next;
    		} else {
    			q = p -> next;
    			p -> next = q -> next;
    			r = root;
    			while (r->next != NULL && r->next->val <= q->val) {
    				r = r->next;
    			}
    			q -> next = r -> next;
    			r -> next = q;
    		}
    	}
    	return root->next;
    }
};