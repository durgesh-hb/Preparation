package questions.recursion.tree.BFS_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class level_order {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		node root = new node(1);
		
		root.left = new node(2);
		root.right = new node(3);
		
		root.left.left = new node(4);
		root.left.right = new node(5);
		
		root.right.left = new node(6);
		root.right.right = new node(7);
		
		levelorder(root);
	}
	
	static void levelorder(node root) {
		
		if(root == null) {
			return;
		}
		
		Queue<node> queue = new LinkedList<>();
			
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				node current = queue.poll();
				
				System.out.print(current.data + " ");
				
				if(current.left != null) {
					queue.offer(current.left);
				}
				if(current.right != null) {
					queue.offer(current.right);
				}
			}
			
			System.out.println();
			
		}
		
	}
}
