package questions.recursion.tree.BFS_Queue;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class top_and_botton_view {
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
	
	static class pair{
		
		node current;
		int hd;
		
		pair(node current,int hd){
			this.current=current;
			this.hd=hd;
		}
		
	}
	
	static void top(node root) {
		
		if(root == null) {
			return;
		}
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		Queue<pair> queue = new LinkedList<>();
		
		queue.offer(new pair(root, 0));
		
		while(!queue.isEmpty()) {
			
			pair temp = queue.poll();
			
			node current = temp.current;
			int hd = temp.hd;
			
			if(!map.containsKey(hd)) {
				map.put(hd, current.data);
			}
			
			if(current.left != null) {
				queue.offer(new pair(current.left, hd - 1));
			}
			
			if(current.right != null) {
				queue.offer(new pair(current.right, hd + 1));
			}
		}
		
		for(int value : map.values()) {
			System.out.print(value + " ");
		}
		
	}
	
		static void bottom(node root) {
		
		if(root == null) {
			return;
		}
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		Queue<pair> queue = new LinkedList<>();
		
		queue.offer(new pair(root, 0));
		
		while(!queue.isEmpty()) {
			
			pair temp = queue.poll();
			
			node current = temp.current;
			int hd = temp.hd;
			
			
			map.put(hd, current.data);
			
			
			if(current.left != null) {
				queue.offer(new pair(current.left, hd - 1));
			}
			
			if(current.right != null) {
				queue.offer(new pair(current.right, hd + 1));
			}
		}
		
		for(int value : map.values()) {
			System.out.print(value + " ");
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
		
		bottom(root);
		System.out.println();
		top(root);
		
//			      	  1
//			        /   \
//			       2     3
//			      / \   / \
//			     4   5 6   7
//
//	     Columns:
//
//	      -2   -1     0    +1   +2
//	       |    |     |     |    |
//	       4    2     1     3    7
//	                  5
//	                  6
	}
	
    
}
