package questions.graph.problems;

import java.util.ArrayList;

public class Number_of_Provinces {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		graph_auto();
	}
	
	public static void graph_auto() {
		
		int vertices = 5;
		
		int[][] edge = {
				{0, 1},
				{2, 3}
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
	
		boolean[] visited = new boolean[vertices];
		
		int province = 0;
		
		for(int i=0; i<vertices; i++) {
			
			if(!visited[i]) {
				
				DFS_graph(graph, i, visited);
				
				province++;
				
			}
			
		}
		
		System.out.println("Province is = " + province);
	}
	
	static void DFS_graph(ArrayList<ArrayList<Integer>> graph,
			  int current, 
			  boolean[] visited) {
			
			visited[current] = true;
			
			System.out.println(current + " ");
			
			for(int n : graph.get(current)) {
			
					if(!visited[n]) {
						
					DFS_graph(graph, n, visited);
					
					}
			}

	}

}
