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
    public List<List<Integer>> verticalOrder(TreeNode root) {
          List<List<Integer>> ans = new  ArrayList<>();
         
         if(root == null) return ans;
         Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
         Map<Integer,List<Integer>> map = new TreeMap<>();
         
        
         q.add(new Pair<>(root,0));
         
         while(!q.isEmpty()){
             
             Pair<TreeNode,Integer> curNode = q.poll();
             TreeNode node = curNode.getKey(); 
             map.computeIfAbsent(curNode.getValue(), k -> new ArrayList<>()).add(node.val);
             if(curNode.getKey().left !=null){
                  q.add(new Pair<>(node.left,curNode.getValue()-1));
             }
              if(curNode.getKey().right !=null){
                  q.add(new Pair<>(node.right,curNode.getValue()+1));
             }
             
         }
        for(List<Integer> level : map.values())
        ans.add(level);
         
         return ans;
    }
}
