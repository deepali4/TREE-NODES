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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        helper(root,ans);
        return ans;
    }
    
    public void helper(TreeNode root,List<List<Integer>> ans)
    {
        Queue<TreeNode> q = new LinkedList<>();
        boolean even = true;
        q.add(root);
            
        while(!q.isEmpty())
        {   LinkedList<Integer> list = new LinkedList<>();
            int n = q.size();
            for(int i =0 ;i< n ; i++)
            {
                TreeNode tempNode = q.poll();
                if(tempNode.left!=null) q.add(tempNode.left);
                if(tempNode.right!=null) q.add(tempNode.right);
                if(even) list.add(tempNode.val);
                else list.addFirst(tempNode.val);
            }
            even=!even;
            ans.add(list);
        }
    }
}
