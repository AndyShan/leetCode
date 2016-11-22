package _206;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode reverseList(ListNode head) {
    	if (head == null || head.next == null) {
    		return head;
    	}
    	ListNode result = new ListNode(0);
    	ListNode p = head;
    	while (p != null) {
    		ListNode q = p.next;
    		p.next = result.next;
    		result.next = p;
    		p = q;
    	}
    	return result.next;
    }
}

class recursiveSolution {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		return getReverse(head, null);
	}
	public ListNode getReverse(ListNode cur, ListNode pre) {
		if (cur.next == null) {
			cur.next = pre;
			return cur;
		}
		ListNode n1 = cur.next;
		cur.next = pre;
		return getReverse(n1, cur);
	}
}