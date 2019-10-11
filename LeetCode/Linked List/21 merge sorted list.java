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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (isNull(l1) || isNull(l2)) {
            return isNull(l1) ? l2 : l1;
        }
        
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            
            return l1;
        }
        
        l2.next = mergeTwoLists(l1, l2.next);
        
        return l2;
    }
}