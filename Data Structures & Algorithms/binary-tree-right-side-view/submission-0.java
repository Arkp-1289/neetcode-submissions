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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null){return res;}
        Queue<TreeNode> q= new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            // System.out.println("qsize: "+q.size()+" t: "+temp);
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode node= q.poll();
                temp.add(node.val);
                // System.out.println("val: "+node.val);

                if (node.left!=null){q.offer(node.left);}
                if (node.right!=null){q.offer(node.right);}
            }
            // System.out.println(temp);
            if (temp.size()>0){
                res.add(temp.get(temp.size()-1));
            }
        }
        return res;


        
    }
}
