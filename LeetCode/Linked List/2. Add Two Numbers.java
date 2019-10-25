/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        
        int sum = 0, carry = 0;
        
        while (l1 != null || l2 != null) {
            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;

            sum += carry;
            
            carry = sum / 10;
            sum %= 10;
            
            result.next = new ListNode(sum);
            result = result.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
            sum = 0;
        }
        
        if (carry == 1) result.next = new ListNode(carry);
        
        return head.next;
    }
    
    
}