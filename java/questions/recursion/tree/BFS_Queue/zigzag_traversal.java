package questions.recursion.tree.BFS_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class zigzag_traversal {
	

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
	
	static void zigzag(node root) {
		
		if(root == null) {
			return;
		}
		
		Queue<node> queue = new LinkedList<>();
		
		queue.offer(root);
		
		boolean leftTOright = true;
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i<size; i++) {
				
				node current = queue.poll();
				list.add(current.data);
				
				if(current.left != null) {
					queue.offer(current.left);
				}
				
				if(current.right != null) {
					queue.offer(current.right);
				}
			}
			
			if(leftTOright) {
				
				for(int i=0; i<size; i++) {
					System.out.print(list.get(i) + " ");
				}
				
			}else {
				
				for(int i=size-1; i>=0; i--) {
					System.out.print(list.get(i) + " ");
				}
			
			}

			System.out.println();
			leftTOright = !leftTOright;
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
		
		zigzag(root);

	}

}
