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

    public boolean solve(TreeNode root,int min_range,int max_range){
        if (root==null){return true;}

        if (root.val<=min_range || root.val>=max_range){return false;}
        
        boolean left= solve(root.left,min_range,root.val);
        if (!left){return false;}
        boolean right = solve(root.right,root.val,max_range);
        
        return left && right;
    }

    public boolean isValidBST(TreeNode root) {
        int min_range=Integer.MIN_VALUE;
        int max_range=Integer.MAX_VALUE;
        return solve(root,min_range,max_range);
    }
}
