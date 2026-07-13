package questions.Heap;

import java.util.ArrayList;
import java.util.Collections;

public class heap_implemention {
    class heap{
		
		ArrayList<Integer> heap = new ArrayList<>();
		
		void insert(int value) {
			
			heap.add(value);
			
			int current = heap.size()-1;
			
			while(current > 0) {
				
				int parent = (current - 1) / 2;
				
				if(heap.get(current) < heap.get(parent)) {
					Collections.swap(heap, current, parent);
					current = parent;
				}else {
					break;
				}
			}		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
