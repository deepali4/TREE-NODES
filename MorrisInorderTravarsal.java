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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        TreeNode pre ;


        while(cur != null){
            // if left subtreee esist move to right
            if(cur.left == null){
                res.add(cur.val);
                cur =cur.right;
            }
            // else create the thread and move to left 
            else{
                pre = cur.left;
                while(pre.right!=null && pre.right!=cur){
                    pre = pre.right;
                }
                //-- thread does not present 
                if(pre.right == null){
                     pre.right =cur; // create the thread and move to left
                     cur =cur.left;
                }// -- if thread already present 
                else {
                    // breake the thread and move to right
                    pre.right = null;
                    res.add(cur.val);
                    cur =cur.right;
                }
                
            }
        }


        return res;
    }
}
