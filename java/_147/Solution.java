package _147;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public ListNode insertionSortList(ListNode head) {
    	ListNode root = new ListNode(0);
    	root.next = head;
    	ListNode p = head;//当前指针
    	ListNode q;
    	ListNode r;
    	while (p != null && p.next != null) {
    		if (p.val <= p.next.val) {//当前值小于等于下一个节点的值，无需排序。
    			p = p.next;
    		} else {
    			q = p.next;//q指向当前指针的下一节点，即需要被插入排序的节点
    			p.next = q.next;//当前指针指向q的下一节点，即删除需要被插入排序的节点
    			
    			r = root;//指向排序区的头结点
    			while (r.next.val <= q.val) {//找到第一个比q大的节点的前驱节点
    				r = r.next;
    			}
    			q.next = r.next;//插入这个节点
    			r.next = q;
    		}
    	}
    	return root.next;
    }
}