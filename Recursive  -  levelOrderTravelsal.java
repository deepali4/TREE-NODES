class Solution {
    List<List<Integer>>  ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root ==  null ) return ans ;
        helper(root,0);
        return ans;
    }

    public void helper(TreeNode root, int level){

        if(ans.size() == level) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);

        if(root.left!= null) helper(root.left,level+1);
        if(root.right!= null) helper(root.right,level+1);

    }
}
