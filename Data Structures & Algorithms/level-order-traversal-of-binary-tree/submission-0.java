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

    
 

    public List<Integer> getQ(Queue<TreeNode> q,Stack<TreeNode> st){
        
        List<Integer> l= new ArrayList<>();
        while (q.isEmpty()){
            TreeNode temp = q.poll();
            l.add(temp.val);
            st.push(temp);
        }
        return l;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (root==null){return res;}
        Queue<TreeNode> q = new ArrayDeque<>();
        Queue<TreeNode> st = new ArrayDeque<>();
        
    
        q.offer(root);
        while (!st.isEmpty() || !q.isEmpty()){
                 if (st.isEmpty()){
                       List<Integer> l= new ArrayList<>();
                        while (!q.isEmpty()){
                            TreeNode temp = q.poll();
                            l.add(temp.val);
                             st.offer(temp);
                          }
                          res.add(l);
                          System.out.println(l);
                } else{

                     while (!st.isEmpty()){
                        TreeNode temp =st.poll();
                        if (temp.left!=null){q.offer(temp.left);}
                        if (temp.right!=null){q.offer(temp.right);}
                      }
                }
        }
        return res;
        
        
    }
}
