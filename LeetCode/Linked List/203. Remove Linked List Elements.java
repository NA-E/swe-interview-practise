/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        
        ListNode node = head;
        
        ListNode prev = null;
        
        while(head != null && head.val == val) head = head.next;
        
        while(node != null && node.next != null) {
            if (node.next.val == val) node.next = node.next.next;
            else node = node.next;            
        }
        
        return head;
    }
}