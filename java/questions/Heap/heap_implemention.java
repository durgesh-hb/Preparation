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

		int delete(){

			int deleted = heap.get(0);
			
			int last = heap.get(heap.size()-1);
			
			heap.set(0, last);
			
			heap.remove(heap.size()-1);
			
			int current = 0;
			
			while(2 * current + 1 < heap.size()) {
				
				int left = 2 * current + 1;
				int right = 2 * current + 2;
				
				// assume first left is smaller 
				int smallest = left;
				
				// if right is smaller let it prove it self? 
				if(right < heap.size() && heap.get(right) < heap.get(left)) {
					smallest = right;
				}
				
				// now we now the which child is smaller
				
				//now normal get the real value compare and swap
				if(heap.get(current) > heap.get(smallest)){
					Collections.swap(heap, current, smallest);
					current = smallest;
				}else{
					break;
				}

			}
			return deleted;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
