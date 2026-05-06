/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public TreeNode invert(TreeNode root){
        if (root==null){return null;}

        invert(root.left);
        invert(root.right);
        TreeNode leftt=root.left;
        root.left=root.right;
        root.right=leftt;
        return root;
    }



    public TreeNode invertTree(TreeNode root) {
        if (root==null){return null;}

        return invert(root);
        
    }
}
