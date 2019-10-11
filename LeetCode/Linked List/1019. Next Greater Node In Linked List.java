/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import static java.util.Objects.nonNull;

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<> ();
        
        while(nonNull(head)) {
            list.add(head.val);
            
            head = head.next;
        }
        
        int[] result = new int[list.size()];
        Stack<Integer> stack = new Stack<> ();
        
        for (int i = 0; i < list.size(); i++) {
            
            while(!stack.empty() && list.get(i) > list.get(stack.peek())) {
                result[stack.pop()] = list.get(i);
            }
            
            stack.push(i);    
        }

        return result;
    }
}