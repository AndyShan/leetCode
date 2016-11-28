package _86;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode connect = after;
        ListNode result = before;
        while (head != null) {
        	if (head.val < x) {
        		before.next = head;
        		before = before.next;
        	} else {
        		after.next = head;
        		after = after.next;
        	}
        	head = head.next;
        }
        before.next = connect.next;
        after.next = null;
        return result.next;
    }
}