package questions.recursion.tree.DFS_recursion;

public class sum_of_all_node {
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
	
	static int sumnode(node root) {
		
		if(root == null) {
			return 0;
		}
		
		int left = sumnode(root.left);
		int right = sumnode(root.right);
		
		return left + right + root.data;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		node root = new node(50);
		
		root.left = new node(30);
		root.right = new node(80);
		
		root.left.left = new node(20);
		
		System.out.println(sumnode(root));
		
	}
}
