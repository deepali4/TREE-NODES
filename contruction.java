import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
	
	static ArrayList<Integer>inorder = new ArrayList<>();
	static ArrayList<Integer>preorder = new ArrayList<>();
	static ArrayList<Integer>postorder = new ArrayList<>();
	
	public Node constructTree() {
		Node root = new Node(0,new Node(1), new Node(2));
		return root;
	}
	public void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		inorder.add(root.val);
		inorder(root.right);
		
	}
	public void preorder(Node root) {
		if(root==null) return;
		preorder.add(root.val);
		preorder(root.left);
		preorder(root.right);
			
	}
	public void postorder(Node root) {
		if(root==null) return;
		postorder(root.left);
		postorder(root.right);
		postorder.add(root.val);
		
	}
	public static void main(String[] args) {
		Tree obj = new Tree();
		Node root = obj.constructTree();
		
		obj.preorder(root);
		obj.inorder(root);
		obj.postorder(root);
		
		System.out.print(preorder);
		System.out.print(inorder);
		System.out.print(postorder);
	}
		
}


// ----- Node class 

public class Node {
	int val;
	Node left;
	Node right;
	
	Node(int val){
		this.val= val;
	}
	Node(int val,Node left, Node right){
		this.left = left;
		this.right= right;
		this.val= val;
	}

}


