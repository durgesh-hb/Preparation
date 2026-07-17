package questions.graph;

import java.util.ArrayList;

public class graph_implementation {

    public static void main(String[] args) {
		
		graph();
       // graph_auto();
	}
	
	public static void graph() {
		
		int vertices = 3;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i=0; i<vertices; i++) {
			graph.add(new ArrayList<>());
		}
		
			// add edge 0 - 1
			graph.get(0).add(1);
	        graph.get(1).add(0);

	        // add edge 0 - 2
	        graph.get(0).add(2);
	        graph.get(2).add(0);

	        // print graph
	        for(int i = 0; i < vertices; i++) {
	            System.out.println(i + " -> " + graph.get(i));
	        }
		
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
	}
    
}
