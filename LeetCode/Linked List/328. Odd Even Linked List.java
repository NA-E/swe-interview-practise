/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        
        ListNode secondNode = head.next;
        ListNode newHead = new ListNode(head.val);
        newHead.next = head.next.next;
        
        ListNode nextNode;
        int count = 1;
        
        while (head.next != null && !(count % 2 == 1 && head.next.next == null)) {
            nextNode = head.next;
            
            head.next = head.next.next;
            
            head = nextNode;
            
            count++;
        }
        
        head.next = secondNode;
        
        return newHead;
    }
}