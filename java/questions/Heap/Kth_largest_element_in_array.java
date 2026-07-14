package questions.Heap;

import java.util.PriorityQueue;

public class Kth_largest_element_in_array {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println(kth(arr, k));

	}
	
	static int kth(int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num : arr) {
			
			pq.offer(num);
			
			if(pq.size() > k) {
				pq.poll();
			}
			
		}
		return pq.peek();
	}
}
