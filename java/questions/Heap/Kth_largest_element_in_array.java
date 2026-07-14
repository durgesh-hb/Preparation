package questions.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_largest_element_in_array {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println(Kth_smallest(arr, k));

	}
	
	static int kth_largest(int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
// here we use the min heap, Because we remove the samllest in the queue. only keep the largest 
		for(int num : arr) {
			
			pq.offer(num);
			
			if(pq.size() > k) {
				pq.poll();
			}
			
		}
		return pq.peek();
	}

    static int Kth_smallest(int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
// here we use the max heap, Because we remove the largest in the queue. only keep the smallest 
		for(int num : arr) {
			
			pq.offer(num);
			
			if(pq.size() > k) {
				pq.poll();
			}
			
		}
		return pq.peek();
	}
}
