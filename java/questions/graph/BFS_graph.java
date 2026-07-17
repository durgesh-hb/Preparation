package questions.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_graph {
    public static void main(String[] args) {
		
		graph_auto();
		
		
	}
	
		public static void graph_auto() {
		
			int vertices = 5;
			
			int[][] edge = {
					{0, 1},
					{0, 2},
					{1, 3},
					{2, 4}
			};
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
			for(int i=0; i<vertices; i++) {
				graph.add(new ArrayList<>());
			}
			
			for(int[] edges : edge) {
				int u = edges[0];
				int v = edges[1];
				
				graph.get(u).add(v);
				graph.get(v).add(u); //undirection
			}
			
			for(int i = 0; i < vertices; i++) {
	            System.out.println(i + " -> " + graph.get(i));
	        }
			
		//->>>>>>>>>>>>>>	
			BFS_queue(graph, 0);
		}
	
	
	static void BFS_queue(ArrayList<ArrayList<Integer>> graph, int start) {
		
		boolean[] visited = new boolean[graph.size()];
		
		Queue<Integer> queue = new LinkedList<>(); 
		
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			
			int current = queue.poll();
			
			System.out.println(current + " ");
			
			for(int n : graph.get(current)) {
				
				if(!visited[n]) {
					
					visited[n] = true;
					queue.offer(n);
					
				}
				
			}
			
		}
		
	} 

}
