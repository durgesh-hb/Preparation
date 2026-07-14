package questions.recursion.tree.DFS_recursion;

public class search_in_a_BST {
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
	
	static boolean search(node root, int target) {
		
		if(root == null) {
			return false;
		}
		
		if(root.data == target) {
			return true;
		}
		if(root.data < target) {
			return search(root.right,target);
		}
	
		return search(root.left, target);
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
		
		System.out.println(search(root,20));
	}
}
