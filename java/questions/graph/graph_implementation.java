package questions.graph;

import java.util.ArrayList;

public class graph_implementation {

    public static void main(String[] args) {
		
		graph();
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
    
}
