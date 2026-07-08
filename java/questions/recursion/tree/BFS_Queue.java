package questions.recursion.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Queue {
    
    static class node{
		
		int data;
		node left;
		node right;
		
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}

	static void levelorder(node root) {
		
		if(root == null) {
			return;
		}
		
		Queue<node> tree = new LinkedList<>();
		
		tree.offer(root);
		
		while(!tree.isEmpty()) {
			
			node current = tree.poll();
			
			System.out.print(current.data + " ");
			
			if(current.left != null) {
				tree.offer(current.left);
			}
			
			if(current.right != null) {
				tree.offer(current.right);
			}
			
		}
		
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

		 levelorder(root); //print node level by level
	}
}
