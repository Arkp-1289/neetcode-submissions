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
    // setDp();
    // public void setDp(TreeNode root){
    //     if (root==null){return;}
    //     dp.put(root,new int[]{-1,-1});
    //     setDp(root.left);
    //     setDp(root.right);
    // }

    public int solve(TreeNode root){
        if (root==null){return 0;}

        if (dp.containsKey(root)){return dp.get(root);}

        int l=solve(root.left);
        int r=solve(root.right);
        dp.put(root,1+Math.max(l,r));
        return dp.get(root);
    }


    public boolean isBalanced(TreeNode root) {
        if (root==null){return true;}
        int left1 = solve(root.left);
        int right1 = solve(root.right);

        if (Math.abs(left1-right1)>1){return false;}
        return (isBalanced(root.left) && isBalanced(root.right));
        
        
    }
}
