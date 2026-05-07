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

    public int solve(TreeNode root,int maxi){

        if (root==null){return 0;}

        int c=0;
        if (root.val>=maxi){
            maxi=root.val;
            c++;
        }
        return c+solve(root.right,maxi)+solve(root.left,maxi);
    }


    public int goodNodes(TreeNode root) {
        return solve(root,Integer.MIN_VALUE);        
    }
}
