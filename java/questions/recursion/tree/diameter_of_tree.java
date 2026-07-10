package questions.recursion.tree;

public class diameter_of_tree {
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
			int right = height(root.left);
			
			return Math.max(left, right) + 1;
		}
	
		static int diameter(node root) {
		
			if(root == null) {
				return 0;
			}
			
			int leftheight = height(root.left);
			int rightheight = height(root.right);
			
			int currentdiameter = leftheight + rightheight + 1;
			
			int leftdiameter = diameter(root.left);
			int rightdiametre = diameter(root.right);
			
			return Math.max(currentdiameter, Math.max(leftdiameter, rightdiametre));
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node root = new node(10);
		
		root.left = new node(5);
		root.right = new node(20);
		
		root.left.left = new node(2);
		
		System.out.println(diameter(root));
	}

}
