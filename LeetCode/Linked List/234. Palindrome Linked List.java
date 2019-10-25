/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode copyHead;
    
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        copyHead = head;
        
        return paliCheck(head);
    }
    
    private boolean paliCheck(ListNode node) {
        if (node == null) return true;
        
        boolean isPaliValid = paliCheck(node.next);
        
        if (!isPaliValid) return false;
        
        if (node.val == copyHead.val) {
            copyHead = copyHead.next;
            
            return true;
        }
        
        return false;
    }
}