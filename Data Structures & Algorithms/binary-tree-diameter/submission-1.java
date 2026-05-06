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

    public int depth(TreeNode root){
        if (root==null){return 0;}
        int l=depth(root.left);
        int r=depth(root.right);
        return 1+Math.max(l,r);
    }

    public int solve(TreeNode root){
        if (root==null){return 0;}
        int left_depth = depth(root.left);
        int right_depth= depth(root.right); 
        return Math.max(left_depth+right_depth,Math.max(solve(root.left),solve(root.right)));

    }


    public int diameterOfBinaryTree(TreeNode root) {
        return solve(root);    
    }
}
