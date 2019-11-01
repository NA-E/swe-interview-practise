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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return makeTree(preorder, inorder, 0, 0, inorder.length - 1);
    }
    
    private TreeNode makeTree(int[] preOrder, int[] inOrder, int preInd, int inOrderS, int inOrderE) {
        if (preInd >= preOrder.length || inOrderS > inOrderE) return null;
        
        int rootVal = preOrder[preInd];
        
        TreeNode node = new TreeNode(rootVal);
        int rootInd = -1;
        
        for (int i = inOrderS; i <= inOrderE; i++) {
            if (inOrder[i] == rootVal) {
                rootInd = i;
                break;
            }
        }
        
        node.left = makeTree(preOrder, inOrder, preInd + 1, inOrderS, rootInd - 1);
        node.right = makeTree(preOrder, inOrder, preInd + (rootInd - inOrderS + 1), rootInd + 1, inOrderE);
        
        
        return node;
    }
}