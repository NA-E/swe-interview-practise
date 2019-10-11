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
    
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        
        int size = populateList(head, nodeList);
        
        return nodeList.get(size/2);
    }
    
    private int populateList(ListNode node, List<ListNode> list) {
        if (isNull(node)) {
            return 0;
        }
        
        list.add(node);
        
        return populateList(node.next, list) + 1;
    }
}