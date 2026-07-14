package questions.recursion.tree.DFS_recursion;

public class invert_the_tree {
    static class node{
		int data;
		node left;
		node right;
	
	node(int data){
		this.data= data;
		this.left= null;
		this.right= null;
	}
	}
	
	static void invert(node root) {
	
		if(root == null) {
			return;
		}
		
		node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invert(root.left);
		invert(root.right);
		
	}
	
	static void preorder(node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		preorder(root.left);
		preorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node root = new node(50);
		
		root.left = new node(30);
		root.right = new node(80);
		
		root.left.left = new node(20);
		root.left.right = new node(40);
		
		root.right.left = new node(70);
		root.right.right = new node(90);
		
		invert(root);
		
		preorder(root);
		
	}

}
