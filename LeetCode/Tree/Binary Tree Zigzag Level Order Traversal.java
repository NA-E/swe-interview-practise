/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        if(root == null) return new ArrayList<List<Integer>> ();
        
        List<List<Integer>> result = new ArrayList<> ();
        
        Queue<TreeNode> queue = new LinkedList<> ();
        queue.add(root);
        
        int level = 0, numberOfNode;
        List<Integer> list;
        TreeNode node;
        
        while(!queue.isEmpty()) {
            numberOfNode = queue.size();
            
            list = new ArrayList<> ();
            while(numberOfNode != 0) {
                node = queue.poll();
                
                list.add(node.val);
                
                numberOfNode--;
                
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            
            if (level % 2 == 1) Collections.reverse(list);
            
            result.add(list);
            level++;
        }

        return result;
    }    
}