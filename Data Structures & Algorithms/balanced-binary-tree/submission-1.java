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

    public int solve(TreeNode root){
        if (root==null){return 0;}

        int l=solve(root.left);
        int r=solve(root.right);
        return 1+Math.max(l,r);
    }


    public boolean isBalanced(TreeNode root) {
        if (root==null){return true;}
        int left1 = solve(root.left);
        int right1 = solve(root.right);

        if (Math.abs(left1-right1)>1){return false;}
        return (isBalanced(root.left) && isBalanced(root.right));
        
        
    }
}
