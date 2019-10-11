/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import static java.util.Objects.isNull;

class Solution {
    public ListNode reverseList(ListNode head) {
        
        Stack<ListNode> stack = new Stack<> ();
        
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        
        if (!stack.isEmpty()) {
            head = stack.pop();
            
            ListNode prev = head;
            ListNode current;
            
            while (!stack.isEmpty()) {
                current = stack.pop();
                prev.next = current;
                prev = current;
            }
            
            prev.next = null;
        }
        
        return head;
    }
}