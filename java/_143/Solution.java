package _143;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null ) {
			return;
		}
		ListNode fast = head;
		ListNode slow = head;
		ListNode p = head;
		ListNode q = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		fast = slow.next;
		slow.next = null;
		p = fast;
		q = fast.next;
		fast.next = null;
		while (q != null) {
			ListNode temp = q.next;
			q.next = p;
			p = q;
			q = temp;
		}
		q = head;
		while (q != null && p != null) {
			ListNode temp1 = q.next;
			ListNode temp2 = p.next;
			p.next = q.next;
			q.next = p;
			q = temp1;
			p = temp2;
		}
	}
}