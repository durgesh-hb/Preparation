package questions.recursion.tree;

public class tree {
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
	
	static void preorder(node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		preorder(root.left);
		preorder(root.right);
	}
	
	static void inorder(node root) {
		
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
		
	}
	
	static void postorder(node root) {
		
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
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
		
	//		    50
	//        /    \
	//      30      80
	//     /  \    /  \
	//   20   40  70  90
		
		System.out.println("Preorder");
		preorder(root);
		
		System.out.println();
		
		System.out.println("Inorder");
		inorder(root);
		
		System.out.println();
		
		System.out.println("Postoredr");
		postorder(root);
		

	}
 
}
