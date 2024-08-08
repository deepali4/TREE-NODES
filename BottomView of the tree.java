
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
         ArrayList <Integer> ans = new  ArrayList<>();
         
         Queue<Pair<Node,Integer>> q = new LinkedList<>();
         Map<Integer,Integer> map = new TreeMap<>();
         
         q.add(new Pair<>(root,0));
         
         while(!q.isEmpty()){
             
             Pair<Node,Integer> curNode = q.poll();
             Node  node = curNode.getKey(); 
             
             map.put(curNode.getValue(),node.data);
             if(curNode.getKey().left !=null){
                  q.add(new Pair<>(node.left,curNode.getValue()-1));
             }
              if(curNode.getKey().right !=null){
                  q.add(new Pair<>(node.right,curNode.getValue()+1));
             }
             
         }
         
        for (int value : map.values()) {
            ans.add(value);
        }
         
         
         return ans;
        // Code here
    }
}
