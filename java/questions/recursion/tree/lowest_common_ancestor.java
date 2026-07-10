package questions.recursion.tree;

public class lowest_common_ancestor {
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
	
	static node lowest_ancestor(node root, node p, node q) {
		
		if(root == null) {
			return null;
		}
		
		if(root == p || root == q) {
			return root;
		}
		
		node left = lowest_ancestor(root.left, p, q);
		node right = lowest_ancestor(root.right, p, q);
		
		
		if(left != null && right != null) {
			return root;
		}
		
		if(left != null) {
			return left;
		}
		
		return right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
