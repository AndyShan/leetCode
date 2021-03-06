package _92;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null)
            return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode res = pre;
        for(int i = 1; i < m; i++)
            pre = pre.next;
        ListNode fast = pre.next;
        for(int i = m; i < n; i++){
            ListNode tmp = pre.next;
            pre.next = fast.next;
            fast.next = pre.next.next;
            pre.next.next = tmp;
        }
        
        return res.next;
    }
}