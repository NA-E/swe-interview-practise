/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> nodeMap = new HashMap<> ();
        int count = 0;
        ListNode saveHead = new ListNode(head.val);
        saveHead.next = head.next;
        
        while (head != null) {
            count++;
            nodeMap.put(count, head);
            head = head.next;
        }
        
        if (count - n == 0) {
            saveHead = saveHead.next;
        } else {
            ListNode prevOfDelete = nodeMap.get(count - n);
            prevOfDelete.next = prevOfDelete.next.next;
            saveHead = nodeMap.get(1);
        }
        
        return saveHead;
    }
}