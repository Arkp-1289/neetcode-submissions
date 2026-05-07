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

    public TreeNode solve(TreeNode root,TreeNode p,TreeNode q){

        if (root==null){return null;}
        // System.out.println(root.val);
        if (root.val>=p.val){
            if (root.val<=q.val){return root;}
            return solve(root.left,p,q);
            
        } 

        return solve(root.right,p,q);
        


    }



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p==null || q==null || root==null){return null;}
        if (p.val>q.val){
            return solve(root,q,p);
        }
        return solve(root,p,q);

    }
}
