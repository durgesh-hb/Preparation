package questions.recursion.tree;

public class count_total_node {
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
	
	static int countnode(node root) {
		
		if(root == null) {
			return 0;
		}
		
		int left = countnode(root.left);
		int right = countnode(root.right);
		
		return left + right + 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		node root = new node(50);
		
		root.left = new node(30);
		root.right = new node(80);
		
		root.left.left = new node(20);
		
		System.out.println(countnode(root));
		
		
	}
}
