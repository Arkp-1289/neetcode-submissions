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

    public void solve(TreeNode root,List<Integer> l){
        
        if (root==null){return ;}

        solve(root.left,l);
        l.add(root.val);
        solve(root.right,l);
        return ;
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>();
        solve(root,l);
        // System.out.println(l);
        return l.get(k-1);
        
    }
}
