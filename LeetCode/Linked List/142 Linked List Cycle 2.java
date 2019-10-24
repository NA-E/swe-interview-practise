/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        
        ListNode p = new ListNode(head.val), q = new ListNode(head.val);
        p.next = head.next;
        q.next = head.next;
        
        while (p != null &&  q != null && q.next != null) {
            if (p == q) break;
            p = p.next;
            q=q.next.next;
        }
        
        if (p != q) return null;
        
        p = head;
        
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        
        return p;
    }
}