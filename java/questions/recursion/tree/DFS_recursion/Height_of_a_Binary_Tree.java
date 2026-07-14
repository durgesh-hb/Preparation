package questions.recursion.tree.DFS_recursion;

public class Height_of_a_Binary_Tree {
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
	
	static int height(node root) {
		
		if(root == null) {
			return 0;
		}
		
		int left = height(root.left);
		int right = height(root.right);
		
		return Math.max(left, right) + 1; // plus means count itself
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		node root = new node(50);
		
		root.left = new node(30);
		root.right = new node(80);
		
		root.left.left = new node(20);
		
		System.out.println(height(root));

		
	}
}
