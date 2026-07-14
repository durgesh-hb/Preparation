package questions.recursion.tree.DFS_recursion;

public class maximum_value_in_tree {
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

	static int maximum_value(node root) {
			
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int left = maximum_value(root.left);
		int right = maximum_value(root.right);
		
		return Math.max(left, Math.max(root.data, right));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node root = new node(50);
		
		root.left = new node(30);
		root.right = new node(80);
		
		root.left.left = new node(20);
		
		System.out.println(maximum_value(root));
		
	}
}
