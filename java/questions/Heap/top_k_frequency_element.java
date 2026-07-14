package questions.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequency_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4,5 ,1 ,2 ,3, 3,};
		int k = 2;
		System.out.println(Arrays.toString(fre(arr, k)));

	}

	static int[] fre(int[] arr, int k) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		// 1 count frequency 
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		// 2 min heap based
		PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);
		// 3 traverse hashmap
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			queue.offer(new int[] {entry.getKey(), entry.getValue()});
			
			if(queue.size() > k) {
				queue.poll();
			}
		}
		
		// storing answer
		int[] ans = new int[k];

	    for (int i = k - 1; i >= 0; i--) {
	        ans[i] = queue.poll()[0];
	    }

	    return ans;
		
		
	}
}
