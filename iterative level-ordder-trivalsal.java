class Solution {
    List<List<Integer>>  ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root ==  null ) return ans ;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
          
            List<Integer> temp = new ArrayList<>();
          
            int n  = q.size();
            for(int i  = 0; i<n;i++){
                TreeNode cur = q.poll();
                temp.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}
