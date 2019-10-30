/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        
        return kthSmallestNode(root, k).val;
    }
    
    private TreeNode kthSmallestNode(TreeNode root, int k) {
        if (root == null) return null;
        
        TreeNode result = kthSmallestNode(root.left, k);
        
        if (result != null) return result;
        
        count++;
        if (count == k) {
            return root;
        }
        
        return kthSmallestNode(root.right, k);
    }
}