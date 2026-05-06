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

        public boolean solve(TreeNode p, TreeNode q){

        if ((p==null && q!=null) || (p!=null && q==null)){return false;}
        
        if (p==null && q==null){return true;}

        if (p.val!=q.val){return false;}

        return solve(p.left,q.left) && solve(p.right,q.right);
    }



    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null && subRoot!=null){return false;}
        if (root==null){return false;}
        if (subRoot==null){return false;}

        if (root.val==subRoot.val){
            if (solve(root,subRoot)){return true;}
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
}
