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
        public List<Integer> postOrder(TreeNode root,List<Integer> res){
        if (root==null){return res;}

        
        postOrder(root.left,res);
        postOrder(root.right,res);
        res.add(root.val);
        return res;

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        return postOrder(root,res);
        
    }
}