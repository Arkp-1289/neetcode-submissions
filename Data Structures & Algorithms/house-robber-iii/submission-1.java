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
    Map<TreeNode,Integer> dp = new HashMap<>();


    public int solve(TreeNode root){

        if (root==null){return 0;}

        if (dp.containsKey(root)){return dp.get(root);}

        int res=root.val;

        if (root.left!=null){
            res+=(solve(root.left.left)+solve(root.left.right));
        }
        if (root.right!=null){
            res+=(solve(root.right.left)+solve(root.right.right));
        }

        dp.put(root,Math.max(res,(solve(root.left)+solve(root.right))));

        return Math.max(res,(solve(root.left)+solve(root.right)));

    

    }





    public int rob(TreeNode root) {
        return solve(root);
        
    }
}