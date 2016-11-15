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
    	ListNode p = head;//��ǰָ��
    	ListNode q;
    	ListNode r;
    	while (p != null && p.next != null) {
    		if (p.val <= p.next.val) {//��ǰֵС�ڵ�����һ���ڵ��ֵ����������
    			p = p.next;
    		} else {
    			q = p.next;//qָ��ǰָ�����һ�ڵ㣬����Ҫ����������Ľڵ�
    			p.next = q.next;//��ǰָ��ָ��q����һ�ڵ㣬��ɾ����Ҫ����������Ľڵ�
    			
    			r = root;//ָ����������ͷ���
    			while (r.next.val <= q.val) {//�ҵ���һ����q��Ľڵ��ǰ���ڵ�
    				r = r.next;
    			}
    			q.next = r.next;//��������ڵ�
    			r.next = q;
    		}
    	}
    	return root.next;
    }
}